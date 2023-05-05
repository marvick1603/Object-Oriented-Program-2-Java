
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 
 * @author patel
 */
public class DisplayStage extends Stage{
   private Label lblDisplay= new Label();
   private Pane pane= new Pane(lblDisplay);
   private Scene scene= new  Scene(pane);
   public DisplayStage(String name){
       setX(50);
       setY(100);
       lblDisplay.setText("Hii"+name);
       setScene(scene);
       
       
   }
   
}
