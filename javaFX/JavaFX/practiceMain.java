import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.*;

public class practiceMain extends Application {

    Stage window;
    Button closeButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Label label1 = new Label("Welcome to the first scene!");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        closeButton = new Button("Close Program");
        closeButton.setOnAction(e -> closeProgram());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1, closeButton);

        Scene scene = new Scene(layout, 600, 600);
        window.setScene(scene);
        window.setTitle("Close Program");
        window.show();
    }

    private void closeProgram() {
        Boolean answer = practice.display("Closing Program", "Hello!");

        if(answer)
            window.close();
    }
}
