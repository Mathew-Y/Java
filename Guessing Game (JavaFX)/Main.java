import javafx.application.Application; // Import Application class
import javafx.geometry.Insets; // Import Insets class
import javafx.geometry.Pos; // Import Pos class
import javafx.scene.Scene; // Import Scene class
import javafx.scene.control.Button; // Import Button class
import javafx.scene.layout.*; // Import all layout classes
import javafx.stage.Stage; // Import Stage class
import javafx.scene.paint.*; // Import all paint classes
import javafx.scene.control.Label; // Import Label class
import javafx.scene.control.ComboBox; // Import ComboBox class
import java.util.Random; // Import Random class

public class Main extends Application
{ // Start of Main class, launch an application

    Random random = new Random(); // Creation of Random called random
    Stage window; // Creation of Stage called window
    Button close_button, yes_button1, no_button1, yes_button2, no_button2; // Create all buttons necessary
    ComboBox<String> comboBox; // Creation of ComboBox called comboBox and pass in only String values
    int answer; // Variable that will store the generated answer
    int guess; // Variable that will store the user's guess
    Label answer_output; // Creation of Label called answerOutput that will display the answer on the defeat screen
    int counter = 0; // Variable that will keep count of the user's tries
    Label inform_tries; // Creation of Label called inform_tries which will inform the user how many tries they have left
    Label higher_or_lower_text; // Creation of Label called higher_or_lower_text which will inform the user if their guess is higher or lower than the answer
    BackgroundFill background_fill; // Creation of BackgroundFill called background_fill which will help change the background colour
    VBox game_layout; // Creation of VBox called game_layout which will be the layout used for our game scene
    VBox win_layout; // Creation of VBox called win_layout which will be the layout used for the victory scene
    VBox lose_layout; // Creation of VBox called lose_layout which will be the layout used for the defeat scene


    public static void main(String[] args)
    { // Start of main method
        launch(args); // Launch JavaFX Application
    } // End of main method

    @Override
    public void start(Stage stage) throws Exception
    { // Start of start method
        window = stage; // Set our window to the stage Stage
        window.setTitle("Mathew's Guessing Game!"); // Set the title of our window to "Mathew's Guessing Game!"

        // Do this if the user presses the x button at the top right
        window.setOnCloseRequest(e ->
        { // Start of instructions upon x button press
            e.consume(); // Processing of the event is complete
            close_program(); // Call the close_program function
        }); // End of instructions upon x button press

        generate_number(); // Call the generate_number function

        Label victory = new Label("Congratulations, You guessed correctly!"); // Creation of Label called victory which will inform the user of their victory
        Label defeat = new Label("You have ran out of tries!"); // Creation of Label called defeat which will inform the user that they ran out of tries
        Label guidance = new Label("Please choose a number between 1 and 10!"); // Creation of Label called guidance which will tell the user to choose a number between 1-10
        inform_tries = new Label("You have " + (3 - counter) + " tries to guess correctly!"); // Reassign inform_tries to a new Label which will inform the user how many tries they have left
        answer_output = new Label("The answer was: " + answer); // Reassign answer_output to a new Label which will inform the user what the answer was after they have lost
        higher_or_lower_text = new Label(""); // Set the higher_or_lower_text label to an empty String for now

        // 2 Labels were created here because you can't have the same label on 2 different scenes
        Label play_again_win = new Label("Would you like to play again?"); // Creation of Label called play_again_win which will be responsible for asking the user if they want to play again on the victory scene
        Label play_again_lose = new Label("Would you like to play again?"); // Creation of Label called play_again_lose which will be responsible for asking the user if they want to play again on the defeat scene

        // Need 2 of each button because once again, we can't have the same button on 2 different scenes
        yes_button1 = new Button("Yes"); // Reassign yes_button1 to a new Button with the text "Yes" on it, will be used on the victory scene
        no_button1 = new Button("No"); // Reassign no_button1 to a new Button with the text "No" on it, will be used on the victory scene
        yes_button2 = new Button("Yes"); // Reassign yes_button2 to a new Button with the text "Yes" on it, will be used on the defeat scene
        no_button2 = new Button("No"); // Reassign no_button2 to a new Button with the text "No" on it, will be used on the defeat scene

        close_button = new Button("Close Program"); // Reassign close_button to a new Button with the text "Close Program" on it
        close_button.setOnAction(e -> close_program()); // If the user presses the Close Program button, call the close_program function

        no_button1.setOnAction(e -> close_program()); // If the user presses the No button, call the close_program function (Victory scene)
        no_button2.setOnAction(e -> close_program()); // If the user presses the No button, call the close_program function (Defeat scene)

        this.win_layout = create_layout(); // Reassign the win_layout VBox to all instructions in the create_layout function
        this.win_layout.getChildren().addAll(victory, play_again_win, yes_button1, no_button1); // Add the following children to the win_layout VBox

        this.lose_layout = create_layout(); // Reassign the lose_layout VBox to all instructions in the create_layout function
        this.lose_layout.getChildren().addAll(defeat, answer_output, play_again_lose, yes_button2, no_button2); // Add the following children to the lose_layout VBox

        this.comboBox = create_ComboBox(); // Reassign comboBox ComboBox to all instructions in create_ComboBox function

        this.game_layout = create_layout(); // Reassign the game_layout VBox to all instructions in the create_layout function
        this.game_layout.getChildren().addAll(guidance, inform_tries, higher_or_lower_text, comboBox, close_button); // Add the following children to the game_layout VBox

        window.setScene(new Scene(this.game_layout, 500, 500)); // Set the scene to a new Scene with the VBox game_layout, make it 500px wide and 500px in height
        window.show(); // Show the Stage (window)

        // Do this if the user presses the Yes Button on the victory scene
        yes_button1.setOnAction(e ->
        { // Start of instructions upon pressing the Yes button on the victory scene
            generate_number(); // Call the generate_number function
            counter = 0; // Set the counter back to 0
            clear_higher_or_lower_text(); // Call the clear_higher_or_lower_text function
            set_tries_text(); // Call the set_tries_text function

            this.game_layout = create_layout(); // Set the game_layout VBox to a new layout by calling the create_layout function
            this.win_layout = create_layout(); // Set the win_layout VBox to a new layout by calling the create_layout function
            this.win_layout.getChildren().addAll(victory, play_again_win, yes_button1, no_button1); // Add the following children to the new win_layout VBox

            this.lose_layout = create_layout();  // Set the lose_layout VBox to a new layout by calling the create_layout function
            this.lose_layout.getChildren().addAll(defeat, answer_output, play_again_lose, yes_button2, no_button2); // Add the following children to the new lose_layout VBox
            this.comboBox = create_ComboBox(); // Reassign the comboBox to a new ComboBox by calling the create_ComboBox function
            this.game_layout.getChildren().addAll(guidance, inform_tries, higher_or_lower_text, this.comboBox, close_button); // Add the following children to the new game_layout VBox
            window.setScene( new Scene(this.game_layout, 500, 500)); // Reset the scene to the new game_layout that we created

            set_comboBox_value(); // Call the set_comboBox_value function

        }); // Start of instructions upon pressing the Yes button on the victory scene

        yes_button2.setOnAction(e ->
        { // Start of instructions upon pressing the Yes button on the defeat scene
            generate_number(); // Call the generate_number function
            counter = 0; // Set the counter back to 0
            clear_higher_or_lower_text(); // Call the clear_higher_or_lower_text function
            set_tries_text(); // Call the set_tries_text function

            this.game_layout = create_layout(); // Set the game_layout VBox to a new layout by calling the create_layout function
            this.win_layout = create_layout(); // Set the win_layout VBox to a new layout by calling the create_layout function
            this.win_layout.getChildren().addAll(victory, play_again_win, yes_button1, no_button1); // Add the following children to the new win_layout VBox

            this.lose_layout = create_layout();  // Set the lose_layout VBox to a new layout by calling the create_layout function
            this.lose_layout.getChildren().addAll(defeat, answer_output, play_again_lose, yes_button2, no_button2); // Add the following children to the new lose_layout VBox
            this.comboBox = create_ComboBox(); // Reassign the comboBox to a new ComboBox by calling the create_ComboBox function
            this.game_layout.getChildren().addAll(guidance, inform_tries, higher_or_lower_text, this.comboBox, close_button); // Add the following children to the new game_layout VBox
            window.setScene( new Scene(this.game_layout, 500, 500)); // Reset the scene to the new game_layout that we created

            set_comboBox_value(); // Call the set_comboBox_value function
        }); // Start of instructions upon pressing the Yes button on the defeat scene
    } // End of start method

    private VBox create_layout()
    { // Start of create_layout function
        VBox layout = new VBox(40); // Create new VBox called layout with 40 px spacing
        layout.setPadding(new Insets(20, 20, 20, 20)); // Set the layout padding to 20px from each side
        layout.setAlignment(Pos.CENTER); // Center all children in the layout VBox
        this.background_fill = new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, Insets.EMPTY); // Set background_fill to a new BackgroundFill with the background set to aquamarine
        Background background = new Background(this.background_fill); // Create a new background and pass in the background_fill we created
        layout.setBackground(background); // Set the background of our layout to the background we created
        return layout; // return the layout
    }

    private ComboBox create_ComboBox()
    { // Start of create_ComboBox function
        ComboBox comboBox = new ComboBox<>(); // Create a new ComboBox called comboBox

        // Add the following options to the comboBox
        comboBox.getItems().addAll(
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"
        );

        comboBox.setPromptText("Select a Number"); // Set the prompt text of the comboBox to "Select a Number"


        // Do this if the user presses an option in the comboBox
        comboBox.setOnAction(e ->
        { // Start of instructions
            convert_to_int(); // Call the convert_to_int function
            counter++; // Add 1 to the counter
            set_tries_text(); // call the set_tries_text function
            display_higher_or_lower_text(); // Call the display_higher_or_lower_text function
            if (guess == answer) // Check if the user's guess is equal to the generated answer
            { // True branch
                Scene victoryScene = new Scene(this.win_layout, 500, 500); // Create a new scene called victoryScene, which will hold the win_layout and will be 500px wide and 500px tall
                window.setScene(victoryScene); // Set the Stage to the victoryScene
            } // End of true branch
            else if (counter == 3) // Check if the user has had 3 guesses
            { // Start of true branch
                set_answer_text(); // Call the set_answer_text function
                Scene defeatScene = new Scene(this.lose_layout, 500, 500); // Create a new Scene called defeatScene which will hold the lose_layout and will be 500px wide and 500px tall
                window.setScene(defeatScene); // Set the Stage to the defeatScene
            } // End of true branch

        }); // End of instructions

        return comboBox; // Return the comboBox
    } // End of create_ComboBox function

    private void close_program()
    { // Start of close_program function
        Boolean response = confirmClose.display("Title", "Are you sure you want to exit?"); // Create a Boolean called response which will call the display function and pass in the title and message
        if(response) // Check if the user pressed yes
            window.close(); // Do this if true
    } // End of close_program function

    private void generate_number()
    { // Start of generate_number fucntion
        answer = random.nextInt(10) + 1; // set answer to a random number between 1 and 10
    } // End of generate_number function

    private void set_answer_text()
    { // Start of set_answer_text function
        answer_output.setText("The answer was: " + answer); // Set the text of the answer_output Label to the assigned text, used to inform the user what the actual answer was
    } // End of set_answer_text function

    private void set_tries_text()
    { // Start of set_tries_text function
        inform_tries.setText("You have " + (3 - counter) + " tries to guess correctly!"); // Set the text of the inform_tries Label to the new amount of tries the user has
    } // End of set_tries_text function

    private void display_higher_or_lower_text()
    { // Start of display_higher_or_lower_text function
        if (guess < answer) // Checks if the user's guess is less than the answer
            higher_or_lower_text.setText("Your guess is too low. Guess higher!"); // Inform user that their guess is too low
        else if(guess > answer) // Checks if the user's guess is greater than the answer
            higher_or_lower_text.setText("Your guess it too high. Guess lower!"); // Inform user that their guess is too high
    } // End of display_higher_or_lower_text function

    private void convert_to_int()
    { // Start of convert_to_int function
        guess = Integer.parseInt(comboBox.getValue()); // Reassign guess to the value the user presses in the comboBox, since this is a string value, we have to convert it to an int
    } // End of convert_to_int function

    private void clear_higher_or_lower_text()
    { // Start of clear_higher_or_lower_text function
        higher_or_lower_text.setText(""); // Clear the text of the higher_or_loser_text Label
    } // End of clear_higher_or_lower_text function

    private void set_comboBox_value()
    { // Start of set_comboBox_value function
        comboBox.setPromptText("Select a Number"); // Set the prompt text of the comboBox to "Select a Number"
    } // End of set_comboBox_value function

} // End of Main class
