/*Jinay Patel
*/
package content;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchStage extends Stage {

    private Label lblCity = new Label("City: ");
    private Label lblPosition = new Label("Position: ");
    private TextField txtCity = new TextField();
    private TextField txtPosition = new TextField();
    private Button btnSearch = new Button("Search");
    private VBox pane = new VBox(getGrid(), btnSearch);
    private Scene scene = new Scene(pane, 720, 640);
    private LinkedList<Employee> list = new LinkedList<>();

    private GridPane getGrid() {
        GridPane gpane = new GridPane();
        gpane.add(lblCity, 0, 0);
        gpane.add(lblPosition, 0, 1);
        gpane.add(txtCity, 1, 0);
        gpane.add(txtPosition, 1, 1);
        return gpane;
    }

    public SearchStage() throws FileNotFoundException {
        txtCity.setOnKeyTyped(e -> {
            pane.getChildren().clear();
            pane.getChildren().add(getGrid());
            pane.getChildren().add(btnSearch);
        });
        txtPosition.setOnKeyTyped(e -> {
            pane.getChildren().clear();
            pane.getChildren().add(getGrid());
            pane.getChildren().add(btnSearch);
        });
        btnSearch.setOnAction(new Search());
        scene.getStylesheets().add("/css/Style.css");
        setTitle("Search Employee");
        setScene(scene);
    }

    public class Search implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            try {
                list = EmployeeFile.setList(list);
                Iterator<Employee> itList = list.iterator();
                while (itList.hasNext()) {
                    Employee one = itList.next();
                    if (txtCity.getText().equalsIgnoreCase(one.getCity()) && txtPosition.getText().equalsIgnoreCase(one.getPosition())) {
                        VBox vpane = new VBox(
                                new Text("\nID: " + String.valueOf(one.getId())),
                                new Text("Name: " + one.getName()),
                                new Text("City: " + one.getCity()),
                                new Text("Position: " + one.getPosition()));
                        pane.getChildren().add(vpane);
                    } else if (txtCity.getText().equalsIgnoreCase(one.getCity()) && txtPosition.getText().equalsIgnoreCase("")) {
                        VBox vpane = new VBox(
                                new Text("\nID: " + String.valueOf(one.getId())),
                                new Text("Name: " + one.getName()),
                                new Text("City: " + one.getCity()),
                                new Text("Position: " + one.getPosition()));
                        pane.getChildren().add(vpane);
                    } else if (txtCity.getText().equalsIgnoreCase("") && txtPosition.getText().equalsIgnoreCase(one.getPosition())) {
                        VBox vpane = new VBox(
                                new Text("\nID: " + String.valueOf(one.getId())),
                                new Text("Name: " + one.getName()),
                                new Text("City: " + one.getCity()),
                                new Text("Position: " + one.getPosition()));
                        pane.getChildren().add(vpane);
                    }
                }
                txtCity.clear();
                txtPosition.clear();
                list.clear();
            } catch (FileNotFoundException ex) {
                System.err.println("File not found");
            }
        }
    }
}
