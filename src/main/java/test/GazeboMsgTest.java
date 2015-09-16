package test;

import gazebo.msgs.GzPosesStamped;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.SubscriberCallback;

import com.google.protobuf.Message;

public class GazeboMsgTest implements SubscriberCallback<GzPosesStamped.PosesStamped> {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	    Utils.setupLogging();
		new GazeboMsgTest().dmain(args);
	}
	
//	OutputStreamWriter oiw;
	BufferedOutputStream bos;

	private void dmain(String[] args) throws Exception {
		
		Node node = new Node("default");
		
		node.waitForConnection();
//		node.subscribe("physics/contacts", GzContacts.Contacts.getDefaultInstance(), cb);
		
		FileOutputStream fos = new FileOutputStream(new File("pose-info"));
		this.bos = new BufferedOutputStream(fos);
//		this.oiw = new OutputStreamWriter(bos);
		
		node.subscribe("pose/info", GzPosesStamped.PosesStamped.getDefaultInstance(), this);
		
		
		
		while (true) {
			Thread.sleep(1000);
			this.bos.flush();
//			this.oiw.flush();
		}
	}

	@Override
	public void callback(GzPosesStamped.PosesStamped msg) {
		//System.out.println(msg.toString());
	    try {
	        msg.writeDelimitedTo(this.bos);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
