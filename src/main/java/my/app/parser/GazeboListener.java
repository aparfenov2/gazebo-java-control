package my.app.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.vecmath.Quat4d;

import gazebo.msgs.GzPose.Pose;
import gazebo.msgs.GzPosesStamped;
import gazebo.msgs.GzPosesStamped.PosesStamped;
import gazebo.msgs.GzQuaternion.Quaternion;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.SubscriberCallback;

import test.Utils;

public class GazeboListener implements SubscriberCallback<GzPosesStamped.PosesStamped> {

    Map<Integer, Link> idToLinkMap = new HashMap<>();
    private Model model; 
    
    Logger LOG = Utils.LOG; 
    
    public GazeboListener(Model model) {
        this.model = model;
    }


    @Override
    public void callback(PosesStamped msg) {
        
        for (Pose pose : msg.getPoseList()) {
            int id = pose.getId();
            Link link = idToLinkMap.get(id);
            if (link == null) {
                String name = pose.getName();
                if (name.contains("::")) {
                    String[] parts = name.split("::");
                    name = parts[1];
                }
                link = model.linksMap.get(name);
                if (link == null) {
                    LOG.severe(String.format("link not found : \"%s\"", name));
                    continue;
                }
                idToLinkMap.put(id, link);
            }
            
            //LOG.fine("received update for node "+link.name);
            
            Quaternion posRot = pose.getOrientation();
            Quat4d q = new Quat4d(posRot.getX(), posRot.getY(), posRot.getZ(), posRot.getW());
            if (link.parentJoint != null) {
                link.parentJoint.setRotation(q);
            } else {
                // TODO: changed position of base link
            }
        }
    }


    public void subscribe(Node node, String topic) {
        node.subscribe(topic, GzPosesStamped.PosesStamped.getDefaultInstance(), this);
    }

}
