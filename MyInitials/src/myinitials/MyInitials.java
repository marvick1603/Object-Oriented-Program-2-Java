/**
Jinay Patel
991662903
Assignment 1
29 Jan 2023
*/
package myinitials;

import content.extend1;
import content.extend2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MyInitials extends Application {
  private extend1 sOne= new extend1();
  private extend2 sTwo= new extend2();
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)  {
        stage.setTitle("ASSI-1");
        sOne.setTitle("Stage1");
        sTwo.setTitle("Stage2");
        ImageView cosmos = new ImageView("image/ocean.jpg");
        Pane pane = new Pane(cosmos);
         Scene scene = new Scene(pane, 400, 400);
         stage.setScene(scene);
         stage.show();
         sOne.show();
         sTwo.show();
    }
    
}
