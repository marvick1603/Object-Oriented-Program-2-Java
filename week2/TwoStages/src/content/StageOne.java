  
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StageOne extends Stage {
    private Rectangle rect1= new Rectangle(30,50,150,200) ;
    private Pane pane= new Pane(rect1); 
        private Scene scene=new Scene(pane,300,500);
   private void setRectangle(){
       rect1.setFill(Color.BLUEVIOLET);
   }
    public StageOne(){
        setRectangle();
        setX(100);
        setY(100);
        setTitle("StageOne");
        setScene(scene);
        
        
    }
}
