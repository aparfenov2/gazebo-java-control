package test;

import gazebo.msgs.GzPacket.Packet;
import gazebo.msgs.GzString;
import gazebo.msgs.StringV.String_V;

import java.io.IOException;
import java.util.logging.Logger;

import org.gazebosim.transport.Connection;
import org.gazebosim.transport.ServerCallback;

public class FakeMaster implements ServerCallback {

    public final Connection server = new Connection();
    
    private static final Logger LOG = Utils.LOG;
    
    public static void main(String[] args) throws Exception {
        Utils.setupLogging();
        new FakeMaster().startListenAsync();
    }
    
    
    public void startListenAsync() throws Exception {
        server.serve("localhost",11345,this);
    }
    
    public void close() throws Exception {
        server.close();
    }

    @Override
    public void handle(Connection conn) throws IOException {
        
        LOG.fine("FakeMaster: Handling new connection");
        LOG.info("FakeMaster: Sending hello");
        conn.writePacket("version_init", GzString.String.newBuilder().setData("6.1").build());
        conn.writePacket("namespaces", String_V.newBuilder().addData("ns1:gazebo").build());
        conn.writePacket("no_publishers_init",  GzString.String.newBuilder().setData("wrong_data").build());
        
        LOG.warning("FakeMaster: Starting new listener");     
        new Thread("Fake Master Thread") {
            @Override
            public void run() {
                LOG.config("FakeMaster: Listening on "+conn.host+":"+conn.port);                
                while (true) {
                    try {
                        Packet pkt = conn.read();
                        LOG.info("FakeMaster: received packet of type "+pkt.getType());
                    } catch (IOException e) {
                        break;
                    }
                }
                LOG.config("FakeMaster: Terminating on "+conn.host+":"+conn.port);
            }
        }.start();
        
    }
}
