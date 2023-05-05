package demokey;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Label lblKeyCode = new Label("KeyCode");
    private Label lblKeyChar = new Label("KeyChar");
    private Label lblKeyText = new Label("KeyText");
    private TextField txtKey = new TextField();
    private TextField txtNumber = new TextField();

    @Override
    public void start(Stage stage) throws Exception {
        txtKey.setOnKeyTyped(e -> {
            lblKeyChar.setText("KeyChar is" + e.getCharacter());
        });
        txtKey.setOnKeyPressed(e -> {
            lblKeyCode.setText("Key Code is: " + e.getCode());
            lblKeyText.setText("Key Text is:" + e.getText());
        });
        txtNumber.setOnKeyReleased(e -> {

            if (e.getCode() != KeyCode.TAB) {

                if (e.getCode().isDigitKey()) {
                    txtNumber.selectBackward();
                    Alert dlgError = new Alert(Alert.AlertType.ERROR);
                    dlgError.setHeaderText("Numbers Only");
                    dlgError.show();
                }
            }
        });

        Scene scene = new Scene(getGrid(), 300, 300);
        stage.setScene(scene);
        stage.setTitle("Key Demo");
        stage.show();
    }

    private GridPane getGrid() {
        GridPane pane = new GridPane();
        VBox pLabel = new VBox(lblKeyCode, lblKeyChar, lblKeyText);
        HBox pText = new HBox(txtKey, txtNumber);
        pane.add(pLabel, 0, 0);
        pane.add(pText, 0, 1);
        return pane;

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
