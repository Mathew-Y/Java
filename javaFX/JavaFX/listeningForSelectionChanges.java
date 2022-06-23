import javafx.application.Application;
import javafx.geometry.Insets;
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
import javafx.scene.control.ChoiceBox;

public class listeningForSelectionChanges extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("ChoiceBox Demo");

        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("Apples", "Bananas", "Bacon", "Ham", "Meatballs");
        choiceBox.setValue("Apples");

        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 500, 500);
        window.setScene(scene);
        window.show();
    }
}
