import java.util.Scanner; // Importing Scanner class
public class HotDogIfStatementsProblem { // Start of hotDogIfStatementsProblem class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        double change = 0.0; // Variable that will store the user's change in his pocket
        final double hotDogPrice = 2.50;

        System.out.print("Please enter how much change you have in your pocket: "); // Ask the user how much change they have
        change = scan.nextDouble(); // Store the user input under the change variable

        if(change >= hotDogPrice) // Check if they have enough change for a hot dog
            System.out.println("Grab a hot dog, enjoy the game!"); // Tell the user that they may grab a hot dog and enjoy the game
        else // If all other ifs are false
            System.out.println("Enjoy the game!"); // Tell the user to enjoy the game, no hot dog

    } // End of main method
} // End of hotDogIfStatementsProblem class
