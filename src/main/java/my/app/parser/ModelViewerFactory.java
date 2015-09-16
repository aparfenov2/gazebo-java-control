package my.app.parser;

import java.io.File;
import java.util.logging.Logger;

import javax.vecmath.Quat4d;

import sun.rmi.runtime.Log;
import test.Utils;

import com.google.common.eventbus.Subscribe;
import com.interactivemesh.jfx.importer.stl.StlMeshImporter;

import javafx.application.Platform;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;

public class ModelViewerFactory {

    public static class EventListener {

        private Model model;
        private Logger LOG = Utils.LOG;

        public EventListener(Model model) {
            this.model = model;
        }

        @Subscribe
        public void OnPoseChanged(Joint.JointRotationChanged evt) {
            try {
                // evt.joint.childLink.group.setR
                Quat4d q = evt.newRot;
                // q.normalize();
                double cos_a = q.w;
                double angle = Math.acos(cos_a) * 2.0d;
                double sin_a = Math.sqrt(1.0 - cos_a * cos_a);
                if (Math.abs(sin_a) < 0.0005d) {
                    sin_a = 1.0d;
                }
                double x = (q.x / sin_a);
                double y = (q.y / sin_a);
                double z = (q.z / sin_a);

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Point3D axis = new Point3D(x, y, z);
                        double angled = Math.toDegrees(angle);
                        
                        //TODO: set pivot point
                        double px = evt.joint.pose[0];
                        double py = -evt.joint.pose[1];
                        double pz = -evt.joint.pose[2];
                        
//                        evt.joint.childLink.group.setRotationAxis(axis);
//                        evt.joint.childLink.group.setRotate(angled);
                        evt.joint.childLink.group.getTransforms().clear();
                        evt.joint.childLink.group.getTransforms().add(new Rotate(angled,px,py,pz,axis));
                        
                        LOG.fine(String
                                .format("received pose change for joint \"%s\": axis (%4.2f;%4.2f;%4.2f), angle: %4.2f",
                                        evt.joint.name, x, y, z, angled));

                    }
                });
            } catch (Exception e) {
                LOG.severe(e.toString());
            }
        }
    }

    public static Group buildSceneGroup(Model model) {
        Group ret = traverseLink(model.root);
        EventListener listener = new EventListener(model);
        model.eventBus.register(listener);
        return ret;
    }

    private static Group traverseLink(Link link) {
        Group ret = new Group();
        link.group = ret;
        for (String meshURI : link.meshes) {

            StlMeshImporter stlImporter = new StlMeshImporter();
            File meshFile = new File(meshURI);
            stlImporter.read(meshFile);

            TriangleMesh mesh = stlImporter.getImport();
            stlImporter.close();

            MeshView meshView = new MeshView(mesh);
            ret.getChildren().add(meshView);
        }
        for (Joint joint : link.childJoints) {
            Link childLink = joint.childLink;
            Group childLinkGroup = traverseLink(childLink);
            double[] relPos = childLink.getRelPos();
            childLinkGroup.setTranslateX(relPos[0]);
            childLinkGroup.setTranslateY(-relPos[1]);
            childLinkGroup.setTranslateZ(-relPos[2]);
            ret.getChildren().add(childLinkGroup);
        }
        return ret;
    }
}
