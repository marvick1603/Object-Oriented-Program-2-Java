package fxarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

public class FXArrayList extends Application {

    private TextField txtName = new TextField();
    private Button btnAdd = new Button("Add name");
    private TextArea txtDisplay = new TextArea();
    private HBox pName = new HBox(txtName, btnAdd);
    private BorderPane pane = new BorderPane();

    private String[] names = {"fred", "barney", "wilma"};
    private ArrayList<String> nameList = new ArrayList();

    @Override
    public void start(Stage stage) {
        setNameList();
        setDisplay();
        
        btnAdd.setOnAction(new AddName()); // call the eventhandle 
        
        pane.setBottom(pName); // it set the pName in the bottom area
        pane.setCenter(txtDisplay); // it set display to the center
        Scene scene = new Scene(pane, 250, 200);  // it call the pane fucntion to exceute
        stage.setScene(scene);
        stage.show();
    }

    private void setNameList() {
        /*for(String name : names){ //  does not take any parameter
            nameList.add(name);     // does not return anything 
        }*/                         // fills namelist with the elements found in names and is called in the first line of the start method
        nameList.addAll(Arrays.asList(names));
    }

    private void setDisplay() {     //does not take any parameter  // does not return anything
        String display = new String();  // it contains all of the eleements found in namelist
        for (String name : nameList) {     
            display += name+"\n";
        }
        txtDisplay.setText(display);  // set the text of txtdisplay to the string 
    }
    
    public class AddName implements EventHandler<ActionEvent>{  // created local class that implements eventhandle and action event

        @Override                             
        public void handle(ActionEvent t) {
            nameList.add(txtName.getText());
            setDisplay();
            txtName.clear();
            txtName.requestFocus();
        }        
    } 

    public static void main(String[] args) {
        Application.launch(args);
    }

}
