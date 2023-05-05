/**
Jinay Patel
991662903
Assignment 1
29 Jan 2023
*/
package content;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author patel
 */
public class extend2 extends Stage{
    Text text = new Text(20, 400, "Jinay Patel\n 991662903");
    Ellipse two1 = new Ellipse(100, 150, 50, 50);
     private Rectangle rect1= new Rectangle(25,110,30,200) ;
     private Pane pane= new Pane(rect1,two1,text); 
        private Scene scene=new Scene(pane,300,500);
 private void setRectangle(){
       rect1.setStrokeWidth(5);
       rect1.setFill(Color.BLACK);
       rect1.setStroke(Color.RED);
   }
   private void setEllipse()
   {
        two1.setStrokeWidth(5);
       two1.setStroke(Color.RED);
       two1.setFill(Color.BLACK);
   }
   private void setText()
   {
      text.setFill(Color.RED); 
   }
   
   
        public extend2(){
            setText();
        setRectangle();
          setEllipse();
        setX(1150);
        setY(100);
        setTitle("StageOne");
          setScene(scene);
        
        
       
        
        
    }
}

