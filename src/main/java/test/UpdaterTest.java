package test;

import gazebo.msgs.GzPosesStamped.PosesStamped;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import my.app.parser.GazeboListener;
import my.app.parser.Model;

import org.gazebosim.transport.Node;
import org.w3c.dom.Document;

import com.google.common.eventbus.AsyncEventBus;

public class UpdaterTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	    Utils.setupLogging();
		new UpdaterTest().dmain(args);
	}

	private void dmain(String[] args) throws Exception {
		
        FakeMaster fakeSrv = new FakeMaster();
        fakeSrv.startListenAsync();
	    
		Node node = new Node("default");		
		node.waitForConnection();
//		Contacts defaultMessage = GzContacts.Contacts.getDefaultInstance();
//		node.subscribe("physics/contacts", defaultMessage, cb);
		
		
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final XPathFactory xPathFactory = XPathFactory.newInstance();
        final XPath xpath = xPathFactory.newXPath();
        
        final Document sdf = documentBuilder.parse(new File("simbicon_ros\\bipe2.sdf"));
        
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
        Model model = new Model(eventBus);
        model.loadFromSDF(sdf, xpath);
		
        MessagePlayer<PosesStamped> player = MessagePlayer.makePosePlayer();
        player.advertiseAnd(node, MessagePlayer.POSE_TOPIC); // advertise before subscribe
        
        GazeboListener listener = new GazeboListener(model);
        listener.subscribe(node, MessagePlayer.POSE_TOPIC);
        
        player.play(new File("pose-info"), 100);
		
		while (true) {
			Thread.sleep(1);
		}
	}

}
