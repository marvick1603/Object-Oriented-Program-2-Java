/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twobuttons;


import content.StageOne;
import content.StageTwo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author patel
 */
public class TwoButtons extends Application{

    /**
     * @param args the command line arguments
     */
private Button btnOne = new Button("Stage One");
private Button btnTwo = new Button("Stage Two"); 
//HBox pane = new HBox(btnOne,btnTwo);
VBox pane = new VBox(10,btnOne,btnTwo);
private Scene scene=new Scene(pane,300,300);
private StageTwo bntTwo = new StageTwo("jinay");
//private StageOne bntOne= new StageOne(); 
    @Override
    public void start(Stage stage)  {
        stage.setScene(scene);
        /**btnOne.setOnMouseClicked((e)-> {
bntOne.show();
});**/
       btnOne.setOnAction((e) ->{
           StageOne bntOne= new StageOne();
        bntOne.show();
    });
       btnTwo.setOnAction((e) ->{
       
       bntTwo.show();
       });
        //bntOne.show();
       stage.setTitle("Two Buttons Example");
       stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

   
    
}
