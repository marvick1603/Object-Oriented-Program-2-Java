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
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;

public class extend1 extends Stage {

    Ellipse two = new Ellipse(150, 55, 150, 10);
   Arc three = new Arc(); 

      Text one = new Text(50, 400, "Jinay Patel \n 991662903");
         private Rectangle rect1= new Rectangle(150,50,30,200) ;
    private Pane pane= new Pane(rect1,two,one,three); 
        private Scene scene=new Scene(pane,300,500);
   private void setRectangle(){
       rect1.setStrokeWidth(5);
       rect1.setFill(Color.BLACK);
       rect1.setStroke(Color.RED);
   }
   private void setEllipse()
   {
        two.setStrokeWidth(5);
       two.setStroke(Color.RED);
       two.setFill(Color.BLACK);
   }
   private void setText()
   {
      one.setFill(Color.RED); 
   }
   private void setArc()
   {
       three.setCenterX(140);
       three.setCenterY(225);
       three.setRadiusX(50);
       three.setRadiusY(50);
       three.setStartAngle(210);
       three.setLength(120);
       three.setStroke(Color.RED);
       
   }
    public extend1(){
     
        
        setArc();
        setRectangle();
          setEllipse();
          setText();
        setX(100);
        setY(100);
        setTitle("StageOne");
          setScene(scene);
        
        setScene(scene);
       
        
        
    }
    
}
