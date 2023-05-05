package employeefx;

/*Jinay Patel
*/
import content.Employee;
import content.EmployeeFile;
import content.SearchStage;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Label lblId = new Label("ID: ");
    private Label lblName = new Label("Name: ");
    private Label lblCity = new Label("City: ");
    private Label lblPosition = new Label("Position: ");
    private TextField txtId = new TextField();
    private TextField txtName = new TextField();
    private TextField txtCity = new TextField();
    private TextField txtPosition = new TextField();
    private Button btnFirst = new Button("First");
    private Button btnNext = new Button("Next");
    private Button btnPrevious = new Button("Previous");
    private Button btnLast = new Button("Last");
    private HBox hPane1 = new HBox(10, btnFirst, btnPrevious, btnNext, btnLast);
    private Button btnAdd = new Button("Add");
    private Button btnUpdate = new Button("Update");
    private Button btnDelete = new Button("Delete");
    private Button btnSearch = new Button("Search");
    private HBox hPane2 = new HBox(5, btnAdd, btnUpdate, btnDelete, btnSearch);
    private VBox pane = new VBox(5, setGrid(), hPane1, hPane2);
    private Scene scene = new Scene(pane, 400, 400);
    private LinkedList<Employee> employeeList = new LinkedList();
    private int count;

    private GridPane setGrid() {
        GridPane pane = new GridPane();
        pane.add(lblId, 0, 0);
        pane.add(lblName, 0, 1);
        pane.add(lblCity, 0, 2);
        pane.add(lblPosition, 0, 3);
        pane.add(txtId, 1, 0);
        pane.add(txtName, 1, 1);
        pane.add(txtCity, 1, 2);
        pane.add(txtPosition, 1, 3);
        return pane;
    }

    private boolean validDelete(int count) {
        try {
            boolean flag1 = Integer.parseInt(txtId.getText()) == employeeList.get(count).getId();
            boolean flag2 = txtName.getText().equals(employeeList.get(count).getName());
            boolean flag3 = txtCity.getText().equals(employeeList.get(count).getCity());
            boolean flag4 = txtPosition.getText().equals(employeeList.get(count).getPosition());
            return flag1 && flag2 && flag3 && flag4;
        } catch (NumberFormatException e) {
            Alert one = new Alert(Alert.AlertType.ERROR);
            one.setHeaderText("ID can only be a number");
            one.showAndWait();
            txtId.setText(String.valueOf(employeeList.get(count).getId()));
            return false;
        }
    }

    public boolean sameID() {
        boolean flag = false;
        int idCheck = Integer.parseInt(txtId.getText());
        for (Employee emp : employeeList) {
            if (idCheck == emp.getId()) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        employeeList = EmployeeFile.setList(employeeList);
        Employee obj = employeeList.getFirst();
        txtId.setText(String.valueOf(obj.getId()));
        txtName.setText(obj.getName());
        txtCity.setText(obj.getCity());
        txtPosition.setText(obj.getPosition());

        txtId.setOnKeyTyped(e -> {
            if (count != employeeList.size()) {
                btnDelete.setDisable(!validDelete(count));
            }
        });
        txtName.setOnKeyTyped(e -> {
            if (count != employeeList.size()) {
                btnDelete.setDisable(!validDelete(count));
            }
        });
        txtCity.setOnKeyTyped(e -> {
            if (count != employeeList.size()) {
                btnDelete.setDisable(!validDelete(count));
            }
        });
        txtPosition.setOnKeyTyped(e -> {
            if (count != employeeList.size()) {
                btnDelete.setDisable(!validDelete(count));
            }
        });
        btnFirst.setOnAction(new FirstRecord());
        btnNext.setOnAction(new NextRecord());
        btnPrevious.setOnAction(new PreviousRecord());
        btnLast.setOnAction(new LastRecord());
        btnAdd.setOnAction(new AddRecord());
        btnUpdate.setOnAction(new UpdateRecord());
        btnDelete.setOnAction(new DeleteRecord());
        btnSearch.setOnAction(e -> {
            try {
                SearchStage one = new SearchStage();
                one.show();
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });
        btnPrevious.setDisable(true);
        scene.getStylesheets().add("/css/Style.css");
        stage.setTitle("Employee Data");
        stage.setOnCloseRequest(new EndProgram());
        stage.setScene(scene);
        stage.show();
    }

    public class AddRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            txtId.clear();
            txtName.clear();
            txtCity.clear();
            txtPosition.clear();
            btnDelete.setDisable(false);
            count = employeeList.size();
            btnNext.setDisable(true);
            btnPrevious.setDisable(true);
        }

    }

    public class UpdateRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            try {
                Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
                confirm.setContentText("Are you sure you want to update the information?");
                Optional<ButtonType> result = confirm.showAndWait();
                if (txtId.getText().equals("") || txtName.getText().equals("") || txtCity.getText().equals("") || txtPosition.getText().equals("")) {
                    throw new NumberFormatException("Text Fields cannot be empty");
                }
                if (count <= employeeList.size()) {
                    if (sameID()) {
                        if(employeeList.get(count).getId()!=Integer.parseInt(txtId.getText())){
                        Alert one = new Alert(Alert.AlertType.ERROR);
                        one.setHeaderText("ID already exists");
                        one.show();
                        }
                        else{
                            employeeList.get(count).setId(Integer.parseInt(txtId.getText()));
                            employeeList.get(count).setName(txtName.getText());
                            employeeList.get(count).setCity(txtCity.getText());
                            employeeList.get(count).setPosition(txtPosition.getText());
                        }
                        if (count == employeeList.size()) {
                            txtId.clear();
                            txtName.clear();
                            txtCity.clear();
                            txtPosition.clear();
                        } else {
                            txtId.setText(String.valueOf(employeeList.get(count).getId()));
                            txtName.setText(employeeList.get(count).getName());
                            txtCity.setText(employeeList.get(count).getCity());
                            txtPosition.setText(employeeList.get(count).getPosition());
                        }
                    } else if (!(txtId.getText().equals("") && txtName.getText().equals("") && txtCity.getText().equals("") && txtPosition.getText().equals(""))) {
                        employeeList.add(new Employee(Integer.parseInt(txtId.getText()), txtName.getText(), txtCity.getText(), txtPosition.getText()));
                    }
                } else {
                    if (result.isPresent() && result.get() == ButtonType.OK) {
                        employeeList.get(count).setId(Integer.parseInt(txtId.getText()));
                        employeeList.get(count).setName(txtName.getText());
                        employeeList.get(count).setCity(txtCity.getText());
                        employeeList.get(count).setPosition(txtPosition.getText());
                        btnDelete.setDisable(false);
                    } else {
                        txtId.setText(String.valueOf(employeeList.get(count).getId()));
                        txtName.setText(employeeList.get(count).getName());
                        txtCity.setText(employeeList.get(count).getCity());
                        txtPosition.setText(employeeList.get(count).getPosition());
                    }
                }
            } catch (NumberFormatException e) {
                Alert one = new Alert(Alert.AlertType.ERROR);
                one.setHeaderText(e.getMessage());
                one.showAndWait();
                if (count != employeeList.size()) {
                    txtId.setText(String.valueOf(employeeList.get(count).getId()));
                    txtName.setText(employeeList.get(count).getName());
                    txtCity.setText(employeeList.get(count).getCity());
                    txtPosition.setText(employeeList.get(count).getPosition());
                }
            }
        }
    }

    public class DeleteRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
            confirm.setContentText("Are you sure you want to delete the record?");
            Optional<ButtonType> result = confirm.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                employeeList.remove(count);
                if (count == employeeList.size()) {
                    count--;
                    Employee one = employeeList.get(count);
                    txtId.setText(String.valueOf(one.getId()));
                    txtName.setText(one.getName());
                    txtCity.setText(one.getCity());
                    txtPosition.setText(one.getPosition());
                } else {
                    Employee one = employeeList.get(count);
                    txtId.setText(String.valueOf(one.getId()));
                    txtName.setText(one.getName());
                    txtCity.setText(one.getCity());
                    txtPosition.setText(one.getPosition());
                }
            }
        }

    }

    public class FirstRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            count = 0;
            Employee one = employeeList.getFirst();
            txtId.setText(String.valueOf(one.getId()));
            txtName.setText(one.getName());
            txtCity.setText(one.getCity());
            txtPosition.setText(one.getPosition());
            btnPrevious.setDisable(true);
            btnNext.setDisable(false);
            btnDelete.setDisable(false);
        }

    }

    public class NextRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            count++;
            Employee one = employeeList.get(count);
            txtId.setText(String.valueOf(one.getId()));
            txtName.setText(one.getName());
            txtCity.setText(one.getCity());
            txtPosition.setText(one.getPosition());
            btnPrevious.setDisable(false);
            if (count == 0) {
                btnPrevious.setDisable(true);
                btnNext.setDisable(false);
            } else if (count == employeeList.size() - 1) {
                btnNext.setDisable(true);
                btnPrevious.setDisable(false);
            }
            btnDelete.setDisable(false);
        }

    }

    public class PreviousRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            count--;
            Employee one = employeeList.get(count);;
            txtId.setText(String.valueOf(one.getId()));
            txtName.setText(one.getName());
            txtCity.setText(one.getCity());
            txtPosition.setText(one.getPosition());
            btnNext.setDisable(false);
            if (count == 0) {
                btnPrevious.setDisable(true);
                btnNext.setDisable(false);
            } else if (count == employeeList.size() - 1) {
                btnNext.setDisable(true);
                btnPrevious.setDisable(true);
            }
            btnDelete.setDisable(false);
        }

    }

    public class LastRecord implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            count = employeeList.size() - 1;
            Employee one = employeeList.getLast();
            txtId.setText(String.valueOf(one.getId()));
            txtName.setText(one.getName());
            txtCity.setText(one.getCity());
            txtPosition.setText(one.getPosition());
            btnNext.setDisable(true);
            btnPrevious.setDisable(false);
            btnDelete.setDisable(false);
        }
    }

    public class EndProgram implements EventHandler<WindowEvent> {

        @Override
        public void handle(WindowEvent t) {
            try {
                EmployeeFile.setFile(employeeList);
                Alert one = new Alert(Alert.AlertType.INFORMATION);
                one.setHeaderText("Data Saved");
                one.setContentText("Data Saved. Program ended");
                one.show();
            } catch (FileNotFoundException ex) {
                Alert one = new Alert(Alert.AlertType.ERROR);
                one.setHeaderText("Error");
                one.setContentText("Data not Saved. Program ending");
                one.show();
            }
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
