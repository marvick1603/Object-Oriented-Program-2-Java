/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fximage1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author patel
 */
public class FXimage1 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Application.launch(args);
    }

    @Override
    public void start(Stage stage){
        ImageView cosmos = new ImageView("image\\cosmos.jpg");
         Pane pane = new Pane(cosmos);
         Scene scene = new Scene(pane, 400, 400);
         stage.setScene(scene);
         stage.show();
    }
    
}
