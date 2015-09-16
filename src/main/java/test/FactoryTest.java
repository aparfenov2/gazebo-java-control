package test;

import gazebo.msgs.GzFactory;
import gazebo.msgs.GzFactory.Factory;
import gazebo.msgs.GzFactory.Factory.Builder;
import gazebo.msgs.GzPose;
import gazebo.msgs.GzPose.Pose;
import gazebo.msgs.GzQuaternion;
import gazebo.msgs.GzQuaternion.Quaternion;
import gazebo.msgs.GzVector3d;
import gazebo.msgs.GzVector3d.Vector3d;
import gazebo.msgs.GzWorldStats;
import gazebo.msgs.GzWorldStats.WorldStatistics;

import java.io.File;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;
import org.gazebosim.transport.Node;
import org.gazebosim.transport.Publisher;

public class FactoryTest {

    public static void main(String[] args) throws Exception {
        Utils.setupLogging();
        new FactoryTest().dmain(args);
    }
    
    private String sdfSample1 = "<sdf version ='1.4'>"+
          "<model name ='sphere'>"+
            "<pose>1 0 0 0 0 0</pose>"+
            "<link name ='link'>"+
              "<pose>0 0 .5 0 0 0</pose>"+
              "<collision name ='collision'>"+
                "<geometry>"+
                  "<sphere><radius>0.5</radius></sphere>"+
                "</geometry>"+
              "</collision"+
              "<visual name ='visual'>"+
                "<geometry>"+
                  "<sphere><radius>0.5</radius></sphere>"+
                "</geometry>"+
              "</visual>"+
            "</link>"+
          "</model>"+
        "</sdf>";
    
    private String sdfSample2 = "<?xml version=\'1.0\'?>" +
    		"<sdf version=\'1.5\'>" +
    		"  <model name=\'unit_box_%d\'>" +
    		"    <pose>%d 0 0 0 -0 0</pose>" +
    		"    <link name=\'link\'>" +
    		"      <inertial>" +
    		"        <mass>1</mass>" +
    		"        <inertia>" +
    		"          <ixx>0.166667</ixx>" +
    		"          <ixy>0</ixy>" +
    		"          <ixz>0</ixz>" +
    		"          <iyy>0.166667</iyy>" +
    		"          <iyz>0</iyz>" +
    		"          <izz>0.166667</izz>" +
    		"        </inertia>" +
    		"      </inertial>" +
    		"      <collision name=\'collision\'>" +
    		"        <geometry>" +
    		"          <box>" +
    		"            <size>1 1 1</size>" +
    		"          </box>" +
    		"        </geometry>" +
    		"      </collision>" +
    		"      <visual name=\'visual\'>" +
    		"        <geometry>" +
    		"          <box>" +
    		"            <size>1 1 1</size>" +
    		"          </box>" +
    		"        </geometry>" +
    		"        <material>" +
    		"          <script>" +
    		"            <name>Gazebo/Grey</name>" +
    		"            <uri>file://media/materials/scripts/gazebo.material</uri>" +
    		"          </script>" +
    		"        </material>" +
    		"      </visual>" +
    		"    </link>" +
    		"  </model>" +
    		"</sdf>";

    

    private void dmain(String[] args) throws Exception {
        
        Node node = new Node("default");
        node.waitForConnection();
        
        Publisher<Factory> pub = node.advertise("factory", GzFactory.Factory.getDefaultInstance());
        
        double axis[] = {1,0,0};
        double angle = Math.PI/2.0d;
        
        Quaternion orientation = GzQuaternion.Quaternion.newBuilder()
        		.setW(Math.cos(angle/2))
        		.setX(axis[0] * Math.sin(angle/2))
        		.setY(axis[1] * Math.sin(angle/2))
        		.setZ(axis[2] * Math.sin(angle/2))
        		.build();
		Vector3d position = GzVector3d.Vector3d.newBuilder()
        		.setX(0)
        		.setY(0)
        		.setZ(0.4)
				.build();
		//        String sdf = FileUtils.readFileToString(new File("simbicon_ros\\scaffold.sdf"));
        Pose pose = GzPose.Pose.newBuilder()
        		.setOrientation(orientation)
        		.setPosition(position)
        		.build();
        
//        Factory msg = fb
//                .setSdfFilename("model://Sun")
//                .build();
        System.out.println("wait for connection");
        pub.waitForConnection();

        String sdf = FileUtils.readFileToString(new File("simbicon_ros\\scaffold.sdf"));
        Factory msg = GzFactory.Factory.newBuilder()
        		.setSdf(sdf)
//        		.setSdfFilename("model://Sun")
//                .setPose(pose)
                .build();
        pub.publish(msg);
        
        System.out.println("publshed scaffold");
        Thread.sleep(1000);
        
        sdf = FileUtils.readFileToString(new File("simbicon_ros\\bipe2.sdf"));
        msg = GzFactory.Factory.newBuilder()
        		.setSdf(sdf)
//        		.setSdfFilename("model://Sun")
                .setPose(pose)
                .build();
        pub.publish(msg);
        
        System.out.println("publshed bipe2");
        
//        int pos_x = 0;
//        while(true) {
//        	int num = (int) (Math.random() * 1000);
//        	pos_x += 1;
//            Factory msg = GzFactory.Factory.newBuilder()
//                    .setSdf(String.format(sdf2, num, pos_x ))
////            		.setSdfFilename("model://cylinder")
////                    .setPose(pose)
//                    .build();
//	        pub.publish(msg);
//	        System.out.println("publshed");
//			Thread.sleep(10000);
//        }
        
//        node.unadvertize("factory");
		Thread.sleep(1000);
//        
        node.server.close();
        node.master.close();
    }

}
