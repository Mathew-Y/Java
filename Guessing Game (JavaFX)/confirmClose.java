import javafx.stage.*; // Import all Stage classes
import javafx.scene.*; // Import all scene classes
import javafx.scene.layout.*; // Import all layout classes
import javafx.scene.control.*; // Import all control classes
import javafx.geometry.*; // Import all geometry classes

public class confirmClose
{ // Start of confirmClose class

    static boolean response; // Variable that will store the user's response to wanting to close the program, it is static to be able to refer to the display function

    public static boolean display(String title, String message)
    { // Start of display function, returns a boolean which is response
        Stage window = new Stage(); // Creation of a new Stage called window

        window.initModality(Modality.APPLICATION_MODAL); // Stops all inputs on the main program when a new window pops up (Close program window)
        window.setTitle(title); // Set the window title to whatever we pass in when using display in Main
        window.setMinWidth(250); // Set the minimum width to 250 px

        Label label = new Label(message); // Creation of a new Label called label, it will store whatever message we pass in when using display in Main

        Button yesButton = new Button("Yes"); // Creation of a Button called button with the text "Yes"
        Button noButton = new Button("No"); // Creation of a Button called button with the text "No"

        // Do this when user presses the yes button (lambda expression)
        yesButton.setOnAction(e ->
        { // Start of instructions upon yesButton press
            response = true; // Set response to true
            window.close(); // Close the alert box window
        }); // End of instructions upon yesButton press

        // Do this when user presses the no button (lambda expression)
        noButton.setOnAction(e ->
        { // Start of instructions upon noButton press
            response = false; // Set response to false
            window.close(); // Close the alert box window
        }); // End of instructions upon noButton press

        VBox layout = new VBox(10); // Create a new VBox called layout with 10 px spacing
        layout.getChildren().addAll(label, yesButton, noButton); // Add the label, yesButton, and noButton we created to the layout
        layout.setAlignment(Pos.CENTER); // Center everything in the layout

        Scene scene = new Scene(layout); // Create a new Scene called scene which will contain the layout we created
        window.setScene(scene); // Set the scene to scene
        window.showAndWait(); // Block all input until this alert box is dealt with

        return response; // Return user's response

    } // End of display function
} // End of confirmClose class