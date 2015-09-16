package test;

import gazebo.msgs.GzPosesStamped.PosesStamped;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import javafx.scene.Group;
import javafx.stage.Stage;

import javax.xml.xpath.XPath;

import my.app.parser.GazeboListener;
import my.app.parser.Model;
import my.app.parser.ModelViewerFactory;

import org.gazebosim.transport.Node;
import org.w3c.dom.Document;

import com.google.common.eventbus.AsyncEventBus;

public class ModelViewerTest extends JavaFXAppBase {
    
    
    Logger LOG = Utils.LOG; 
    
    public static void main(String[] args) throws Exception {
        Utils.setupLogging();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        final XPath xpath = Utils.makeXPath();
        final Document sdf = Utils.parseXML(new File("simbicon_ros\\bipe2.sdf"));
        
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
        Model model = new Model(eventBus);
        model.loadFromSDF(sdf, xpath);
        
        Group modelGroup = ModelViewerFactory.buildSceneGroup(model);
        double scale = 400;
        modelGroup.setScaleX(scale);
        modelGroup.setScaleY(scale);
        modelGroup.setScaleZ(scale);
        world.getChildren().add(modelGroup);
        
        
        FakeMaster fakeSrv = new FakeMaster();
        fakeSrv.startListenAsync();
        
        Node node = new Node("default");        
        node.waitForConnection();

        MessagePlayer<PosesStamped> player = MessagePlayer.makePosePlayer();
        player.advertiseAnd(node, MessagePlayer.POSE_TOPIC); // advertise before subscribe
        
        
        GazeboListener listener = new GazeboListener(model);
        listener.subscribe(node, MessagePlayer.POSE_TOPIC);
        
        player.playAsync(new File("pose-info"), 10);

        super.start(primaryStage);
        
    }
    
    
}
