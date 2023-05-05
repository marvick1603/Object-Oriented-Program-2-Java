/**
 * Jinay Gomeshkumar Patel
 * 991662903
 * Assignment 2
 * 2 March 2023
 */
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 
/**
 *
 * @author patel
 */
public class records extends Stage{
   private Label lbl1= new Label();
   private Label lbl2= new Label();
   private Label lbl3= new Label();
   private Label lbl4= new Label();
    private GridPane getGrid(){
        GridPane pane = new GridPane();
      
        pane.add(lbl1, 0, 0); 
        pane.add(lbl2, 1, 0);
        pane.add(lbl3, 0,1); 
        pane.add(lbl4, 1, 1);
        
        return pane;
    }
    private Scene scene= new Scene(getGrid(),300,500);
    public records(String ID, String name , String Add,  String Cit ){
       setX(50);
       setY(100);
       lbl1.setText("ID:"+ID);
       lbl2.setText("Name:"+name);
       lbl3.setText("Address:   "+Add);
       lbl4.setText("City:"+Cit);
       
       
       setScene(scene);
    }
}
