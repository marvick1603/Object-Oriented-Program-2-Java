package studentgui;

import content.Student;
import content.StudentFile;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    private final LinkedList<Student> studentList = new LinkedList();
    private final Label lblID = new Label("Student ID: ");
    private final TextField txtID = new TextField();
    private final Label lblMark = new Label("Student Mark: ");
    private final TextField txtMark = new TextField();
    private final Button btnAdd = new Button("Add Student");

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(studentPane(), 300, 150);
        btnAdd.setOnAction(new AddStudent());
        stage.setOnCloseRequest(new EndProgram());
        stage.setScene(scene);
        stage.show();
    }

    private GridPane studentPane() {
        GridPane pane = new GridPane();
        pane.add(lblID, 0, 0);
        pane.add(txtID, 1, 0);
        pane.add(lblMark, 0, 1);
        pane.add(txtMark, 1, 1);
        pane.add(btnAdd, 0, 2);
        return pane;
    }

    public class EndProgram implements EventHandler<WindowEvent> {

        @Override
        public void handle(WindowEvent t) {
            try {
          
                StudentFile.saveStatus(studentList);
                Alert dlginformation = new Alert(Alert.AlertType.INFORMATION);
                dlginformation.setContentText("DataSaved - Program Ended");
                dlginformation.show();
            } catch (FileNotFoundException e) {
                Alert dlgError = new Alert(Alert.AlertType.ERROR);
                dlgError.setHeaderText("Data not saved - Program Ending");
                dlgError.show();
            }
        }
        
    }

    public class AddStudent implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            int ID = Integer.parseInt(txtID.getText());
            Student one = new Student(ID);
            int marks = Integer.parseInt(txtMark.getText());
            one.setMarks(marks);
            studentList.add(one);
            txtID.clear();
            txtMark.clear();
            txtID.requestFocus();
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
