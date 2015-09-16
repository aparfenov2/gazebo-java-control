package test;

import gazebo.msgs.GzPosesStamped.PosesStamped;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Publisher;

import com.google.protobuf.Message;

public class MessagePlayer<T extends Message> {

    public interface IMessageBuilder<T> {
        T parseDelimitedFrom(InputStream is) throws Exception;
    }
    
    public static void main(String[] args) throws Exception {
        Utils.setupLogging();
        
        FakeMaster fakeSrv = new FakeMaster();
        fakeSrv.startListenAsync();
        
        Node node = new Node("default");
        node.waitForConnection();
        
        makePosePlayer().advertiseAnd(node, POSE_TOPIC).play(new File("pose-info"), 100);
        
        fakeSrv.close();
        System.exit(0);
    }
    
    public static final String POSE_TOPIC = "pose/info";
    
    public static MessagePlayer<PosesStamped> makePosePlayer() {
        return new MessagePlayer<PosesStamped>( 
                PosesStamped.getDefaultInstance(),
                (is) -> PosesStamped.parseDelimitedFrom(is)
                );
    }

    Logger LOG = Utils.LOG;
    

    private T defaultInstance;
    private IMessageBuilder<T> builder;
    private Publisher<T> pub;
    
    
    public MessagePlayer(T defaultInstance, IMessageBuilder<T> builder) {
        this.defaultInstance = defaultInstance;
        this.builder = builder;
    }
    
    public MessagePlayer<T> advertiseAnd(Node node, String topic) {
        this.pub = node.advertise(topic, defaultInstance);
        return this;
    }
    
    public void play(File file, int delay) throws Exception {
        publishFromBinaryFile(pub, file, delay);        
        LOG.info("done reading file");
    }
    
    public void playAsync(File file, int delay) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    MessagePlayer.this.play(file, delay);
                } catch (Exception e) {
                    LOG.severe(e.toString());
                }
            }
            
        }, "player").start();
    }

    private void publishFromBinaryFile(Publisher<T> pub, File file, int delay) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        for(;;) {
//            LOG.fine(bis.available()+"");
            if (bis.available() <= 0) {
                return;
            }
            T msg = builder.parseDelimitedFrom(bis);
            LOG.fine("publishing a msg");
            pub.publish(msg);
            Thread.sleep(delay);
        }
    }

}