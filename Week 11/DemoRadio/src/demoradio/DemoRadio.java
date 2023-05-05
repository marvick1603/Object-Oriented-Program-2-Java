package demoradio;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoRadio extends Application {
    private Label lblOrder = new Label ("You have chosen small");
    private RadioButton radSmall = new RadioButton("Small");
    private RadioButton radMedium = new RadioButton("Medium");
    private RadioButton radLarge = new RadioButton("Large");
    
    @Override
    public void start(Stage stage) {
        
        radSmall.setOnAction(new SetOrder());
        radMedium.setOnAction(new SetOrder());
        radLarge.setOnAction(new SetOrder());
        
        Scene scene = new Scene(getSize(), 300, 150);
        scene.getStylesheets().add("/Style/TheStyle.css");
        stage.setScene(scene);
        stage.setTitle("Demo Radio");
        stage.show();
    }
    
    private BorderPane getSize(){
        radSmall.setSelected(true);
        
        ToggleGroup group = new ToggleGroup();
        radSmall.setToggleGroup(group);
        radMedium.setToggleGroup(group);
        radLarge.setToggleGroup(group);
        
        VBox pSize = new VBox(radSmall, radMedium, radLarge);
                
        BorderPane pane = new BorderPane();
        pane.setTop(new Label ("Chose Your Size"));
        pane.setCenter(pSize);
        pane.setBottom(lblOrder);        
        return pane;
    }
    
    public class SetOrder implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            String sOrder = "You have choosen: ";
            if(radSmall.isSelected()){
                sOrder += "small";
            }else if(radMedium.isSelected()){
                sOrder += "medium";
            }else if(radLarge.isSelected()){
                sOrder += "large";
            }
            lblOrder.setText(sOrder);
        }
    }
    
    public static void main(String[] args) {
     Application.launch(args);   
    }
}
