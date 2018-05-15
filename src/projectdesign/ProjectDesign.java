/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdesign;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Gustavo Vieira
 */
public class ProjectDesign extends Application {
    
    private static BorderPane ROOT;
    public static BorderPane getRoot() {
        return ROOT;
    };
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home/FXMLMenuPage.fxml"));
        
        Pane peoplePane = FXMLLoader.load(getClass().getResource("warehouse/topbar/FXMLWarehousePage.fxml"));
        ((BorderPane) root).setCenter(peoplePane);
        
        Pane peoplePane2 = FXMLLoader.load(getClass().getResource("warehouse/leftbar/FXMLWarehouseLeftMenuPage.fxml"));
        ((BorderPane) peoplePane).setCenter(peoplePane2);
        
        Pane peoplePane3 = FXMLLoader.load(getClass().getResource("warehouse/info/FXMLInfoTopBarPage.fxml"));
        ((BorderPane) peoplePane2).setCenter(peoplePane3);
        
        Pane peoplePane4 = FXMLLoader.load(getClass().getResource("warehouse/info/FXMLTablePage.fxml"));
        ((BorderPane) peoplePane3).setCenter(peoplePane4);
        
        ProjectDesign.ROOT = (BorderPane) root;
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Armazém - Produtos");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
