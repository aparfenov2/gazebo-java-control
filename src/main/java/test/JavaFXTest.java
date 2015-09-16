package test;

import java.io.File;

import com.interactivemesh.jfx.importer.stl.StlMeshImporter;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;


public class JavaFXTest extends JavaFXAppBase {

    
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        StlMeshImporter stlImporter = new StlMeshImporter(); 
        File meshFile = new File("simbicon_ros\\meshes\\lupperarm.stl");
        stlImporter.read(meshFile);
        
        TriangleMesh mesh = stlImporter.getImport();
        stlImporter.close();
        
        MeshView meshView = new MeshView(mesh);
        world.getChildren().add(meshView);
        
        meshView.setScaleX(1000);
        meshView.setScaleY(1000);
        meshView.setScaleZ(1000);
//        meshView.setDrawMode(DrawMode.FILL);
//        
//        final PhongMaterial blueMaterial = new PhongMaterial();
//        blueMaterial.setDiffuseColor(Color.DARKBLUE);
//        blueMaterial.setSpecularColor(Color.BLUE);
//
//        meshView.setMaterial(blueMaterial);

        super.start(primaryStage);
    }
    
}
