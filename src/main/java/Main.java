import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * 
 * Main
 * GUI class for JavaFX Tutorial
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World"); // Create label
        Scene scene = new Scene(helloWorld); // Set the label as scene
        stage.setScene(scene); // Set the stage to show the scene
        stage.show(); // Render the stage
    }

}
