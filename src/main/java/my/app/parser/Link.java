package my.app.parser;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Group;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Link {

    public String name;
    public Joint parentJoint;
    public List<Joint> childJoints = new ArrayList<>();
    public List<String> meshes = new ArrayList<>();
//    public BoundingBox boundingBox;
    public double[] absPos = new double[6]; // x,y,z,rx,ry,rz
    public Group group;
    

    public void loadFromSDLNode(Node likNode, XPath xpath) throws Exception {
        this.name = xpath.evaluate("@name", likNode);
        String poseString = xpath.evaluate("pose", likNode);
        String[] parts = poseString.split("\\s");
        int i=0;
        for (String part : parts) {
            absPos[i++] = Double.parseDouble(part);
        }
        // read meshes
        final NodeList visualNodes = (NodeList) xpath.evaluate("visual",likNode, XPathConstants.NODESET);
        for (i = 0; i < visualNodes.getLength(); i++) {
            final Node visualNode = visualNodes.item(i);
            
            String meshURI = xpath.evaluate("geometry/mesh/uri", visualNode);
            meshURI = meshURI.substring("model://".length());
            meshURI = meshURI.replace('/', '\\');
            
//            StlMeshImporter stlImporter = new StlMeshImporter(); 
//            File meshFile = new File(meshURI);
//            stlImporter.read(meshFile);
//            
//            TriangleMesh mesh = stlImporter.getImport();
//            stlImporter.close();
            meshes.add(meshURI);
        }
        
        // calculate bounding box
//        double w=0, h=0, d=0;
//        for (TriangleMesh mesh : meshes) {
//            MeshView meshView = new MeshView(mesh);
//            Bounds bounds = meshView.getBoundsInLocal();
//            // assume all visuals are at pose {0,0,0}
//            w = Math.max(w, bounds.getWidth());
//            h = Math.max(h, bounds.getHeight());
//            d = Math.max(d, bounds.getDepth());
//        }
//        boundingBox = new BoundingBox(0,0,0,w,h,d); 
    }
    
    public Link getParent() {
        return parentJoint.parentLink;
    }
    
    public double[] getRelPos() {
        double[] parentAbsPos = getParent().absPos;
        double[] ret = new double[6];
        ret[0] = absPos[0] - parentAbsPos[0];
        ret[1] = absPos[1] - parentAbsPos[1];
        ret[2] = absPos[2] - parentAbsPos[2];
        ret[3] = absPos[3];
        ret[4] = absPos[4];
        ret[5] = absPos[5];
        return ret;
    }
    

}
