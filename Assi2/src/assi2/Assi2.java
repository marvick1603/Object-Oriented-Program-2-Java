/**
 * Jinay Gomeshkumar Patel
 * 991662903
 * Assignment 2
 * 2 March 2023
 */
package assi2;

import content.records;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Assi2 extends Application {

    int i = 0, j = 0, k = 0, l = 0;

    private Label lb1 = new Label("ID:");
    private Label lb = new Label();
    private TextField txtID = new TextField("");
    private Label lb2 = new Label("Name:");
    private TextField txtName = new TextField("");
    private Label lb3 = new Label("Address:");
    private TextField txtAddress = new TextField("");
    private Label lb4 = new Label("City:");
    private TextField txtCity = new TextField("");
    private Button save = new Button("Save");
    private Button display = new Button("Display");
    private Circle c = new Circle(12, 12, 12, Color.RED);
    private Circle f = new Circle(12, 12, 12, Color.RED);
    private Circle e1 = new Circle(12, 12, 12, Color.RED);
    private Circle d = new Circle(12, 12, 12, Color.RED);

    private GridPane getGrid() {
        GridPane pane = new GridPane();
        // we have used grid pane
        pane.add(lb1, 0, 0);
        pane.add(txtID, 1, 0);
        pane.add(lb2, 0, 1);
        pane.add(txtName, 1, 1);
        pane.add(lb3, 0, 2);
        pane.add(txtAddress, 1, 2);
        pane.add(lb4, 0, 3);
        pane.add(txtCity, 1, 3);
        pane.add(save, 0, 4);
        pane.add(display, 1, 4);

        save.setOnAction((e) -> {
            if (txtID.getText().isEmpty() == false && i == 0) {
                pane.add(c, 0, 7);
                i = 1;
            }
            if (txtName.getText().isEmpty() == false && j == 0) {
                pane.add(d, 1, 7);
                j = 1;
            }
            if (txtAddress.getText().isEmpty() == false && k == 0) {
                pane.add(e1, 2, 7);
                k = 1;
            }
            if (txtCity.getText().isEmpty() == false && l == 0) {
                pane.add(f, 3, 7);
                l = 1;
            }
        });

        display.setOnMouseClicked((eh) -> {
           txtID.requestFocus();
            i = 0;
            j = 0;
            k = 0;
            l = 0;
            pane.getChildren().remove(c);
            pane.getChildren().remove(d);
            pane.getChildren().remove(e1);
            pane.getChildren().remove(f);
        });

        return pane;
    }
    private Scene scene = new Scene(getGrid(), 300, 500);

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        display.setDisable(true);
        //even handling for save button
        save.setOnMouseClicked((e) -> {
            /*
       in this event every condition is checked
             */
           
 String[] records= new String[4];
 records[0]=null;
  records[1]=null;
   records[2]=null;
    records[3]=null;
            if (txtID.getText().isEmpty() == false) {
               
                 records[0]= txtID.getText();
            }

            if (txtName.getText().isEmpty() == false) {
              
                  records[1]=txtName.getText();
            }
            if (txtAddress.getText().isEmpty() == false) {
               
records[2]=txtAddress.getText();
            }
            if (txtCity.getText().isEmpty() == false) {
               
records[3]= txtCity.getText();
            }

            if ((records[0] != null) && (records[1] != null) && ( records[2]!= null) && (records[3]!= null)) {
                save.setDisable(true);
                
                txtID.clear();
                 txtID.requestFocus();
                txtName.clear();
                txtAddress.clear();
                txtCity.clear();
               

                final String id = records[0];
                final String nam = records[1];
                final String ad = records[2];
                final String ci =records[3];

                display.setDisable(false);
                display.setOnAction((eh) -> {
                    /*
             this is event for the display button where the stage for display is called
                     */

                    save.setDisable(false);
                    
                    records r = new records(id, nam, ad, ci); txtID.requestFocus();
                    r.show();
                     
                    display.setDisable(true);
                });
            }

        });
        stage.setScene(scene);
        stage.show();
    }

}
