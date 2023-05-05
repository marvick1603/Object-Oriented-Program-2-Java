
package twostages;



import content.StageOne;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


import javafx.stage.Stage;

public class TwoStages extends Application {
private Rectangle rect1= new Rectangle(30,50,150,200) ;
private Pane pane= new Pane(rect1); 
        private Scene scene=new Scene(pane,300,500);
        private StageOne sOne= new StageOne();

   private void setRectangle(){
       rect1.setFill(Color.BLUE);
   }
        public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("TwoStage Example");
        setRectangle();
        sOne.show();
       
        stage.setScene(scene);
        stage.show();
        
       
    }
    
}
