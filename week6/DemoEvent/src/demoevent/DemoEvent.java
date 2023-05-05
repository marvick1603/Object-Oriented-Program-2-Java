/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoevent;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author patel
 */
public class DemoEvent extends Application {

    /**
     * @param args the command line arguments
     */
    private Button btnCircle = new Button("Add Circle");
private Button btnSquare = new Button("Add Square");
private HBox bpane = new HBox(btnCircle,btnSquare);
private HBox spane = new HBox(10);
private VBox pane = new VBox(bpane,spane);
private Scene scene = new Scene(pane);

     @Override
    public void start(Stage stage)  {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  btnCircle .setOnAction((e) -> {
    sPane.getChildren.add(addCircle);

});
  btnSquare.setOnAction((e)->{
       stage.setScene(scene);
       stage.show();
    });
    private Ellipse addCircle(){
        Ellipse two = new Ellipse();
        two.setFill(Color.RED);
        return two;
    }
    private Rectangle addSquare(){
        Rectangle one = new Rectangle(50,50,50,50);
        one.setFill(Color.AQUA);
        return one;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
        
    }

    
    
}
