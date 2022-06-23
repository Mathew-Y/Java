import java.util.Scanner; // Importing Scanner class

public class SweaterIfStatementsProblem { // Start of sweaterIfStatementsProblem

    public static void main(String[] args) { // Start of main method

        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        String user_colour = null; // Variable that will receive the user's sweater colour

        System.out.format("%s %n", "Welcome to the Sweater Shop! We have sweaters in the following colours: blue, black, red and white."); // Informs the user of the different colour options
        System.out.print("Please choose a sweater colour: "); // Asks user to choose a sweater colour
        user_colour = scan.nextLine(); // Saves user's sweater colour under variable input

        if(user_colour.equalsIgnoreCase("Black") || user_colour.equalsIgnoreCase("white")) // Is user's chosen colour black or white?
            System.out.format("%s", "You have enough sweaters in this colour."); // Execute this line if black or white was chosen
        else if(user_colour.equalsIgnoreCase("Red")) // Is user's chosen colour red?
            System.out.format("%s %n %s", "This colour looks good on you.", "How about a pair of jeans to go with the sweater?"); // Execute line if red was chosen
        else if(user_colour.equalsIgnoreCase("Blue")) // Is user's chosen colour blue?
            System.out.format("%s", "This colour doesn't go well with your complexion."); // Execute line if blue was chosen
        else // Go here if user's input wasn't any of the options given
            System.out.format("%s", "Your colour choice is invalid."); // Tell user that they entered a colour that wasn't an option

    } // End of main method
} // End of sweaterIfStatementsProblem
