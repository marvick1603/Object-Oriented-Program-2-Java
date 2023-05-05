
package firstfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("First FX");
        stage.setWidth(500);
        stage.setHeight(300);
        stage.show();
    }
    
}
