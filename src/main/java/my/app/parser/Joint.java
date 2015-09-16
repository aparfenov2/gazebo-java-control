package my.app.parser;

import java.util.Map;

import javax.vecmath.Quat4d;
import javax.xml.xpath.XPath;

import org.w3c.dom.Node;

import com.google.common.eventbus.EventBus;

public class Joint {

    public class JointRotationChanged {

        public Quat4d oldRot;
        public Quat4d newRot;
        public Joint joint;

        public JointRotationChanged(Joint joint, Quat4d oldRot, Quat4d newRot) {
            this.joint = joint;
            this.oldRot = oldRot;
            this.newRot = newRot;
        }

    }

    public String name;
    public Link childLink;
    public Link parentLink;
    private EventBus eventBus;
    public double[] pose = new double[6];

    public Joint(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void loadFromSDLNode(Node jointNode, XPath xpath, Map<String, Link> linksMap) throws Exception {
        
        this.name = xpath.evaluate("@name", jointNode);

        String poseString = xpath.evaluate("pose", jointNode);
        String[] parts = poseString.split("\\s");
        int i=0;
        for (String part : parts) {
            pose[i++] = Double.parseDouble(part);
        }
        
        String childLinkName = xpath.evaluate("child", jointNode);
        String parentLinkName = xpath.evaluate("parent", jointNode);
        
        if (!linksMap.containsKey(childLinkName)) {
            throw new RuntimeException(String.format("child link \"%s\" not found", childLinkName));
        }
        if (!linksMap.containsKey(parentLinkName)) {
            throw new RuntimeException(String.format("parent link \"%s\" not found", parentLinkName));
        }
        childLink = linksMap.get(childLinkName);
        parentLink = linksMap.get(parentLinkName);
    }
    
    
    public Quat4d rotation = new Quat4d();

    public void setRotation(Quat4d newRot) {
        Quat4d oldRot = rotation;
        rotation = newRot;
        eventBus.post(new JointRotationChanged(this, oldRot, newRot));
    }
    

}
