import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.geometry.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;

public class textFieldValidation extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Window");

        TextField nameInput = new TextField();
        nameInput.setPromptText("Enter an integer");

        button = new Button("Click me");
        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

        scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();

    }

    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        }
        catch(NumberFormatException ex) {
            System.out.println("Error: " + message + " is not an integer");
            return false;
        }
    }
}
