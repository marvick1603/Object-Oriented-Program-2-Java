/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demotest;

import content.DisplayStage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author patel
 */
public class DemoTest extends Application {

    /**
     * @param args the command line arguments
     */
    private Label lblName= new Label("Name:");
    private TextField txtName= new TextField("textbox");
    private Button btnDisplay = new Button("Display:");
    private Button btnClear= new Button("Clear");
   
    
 
    private GridPane getGrid(){
        GridPane pane = new GridPane();
      
        pane.add(lblName, 0, 0); 
        pane.add(txtName, 1, 0);
        pane.add(btnDisplay, 0,1); 
        pane.add(btnClear, 1, 1);

        return pane;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
  
    
    @Override
       public void start(Stage stage)  {
       Scene scene= new Scene(getGrid(),200,200);
        btnDisplay.setOnMouseClicked((e)->{
           String name=txtName.getText();
       DisplayStage d= new DisplayStage(name);
d.show();
      
       
       });
       btnClear.setOnMouseClicked((e)->{
           txtName.clear();
           
           txtName.requestFocus();
       });
       
       stage.setScene(scene);
       stage.show();
    }

    
   
    
}
