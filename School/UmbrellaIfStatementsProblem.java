import java.util.Scanner; // Import Scanner class
public class UmbrellaIfStatementsProblem { // Start of umbrellaIfStatementsProblem class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        int probability = 0; // Variable that will store the user's inputted probability of raining

        System.out.print("Please enter the probability of it raining today in percentage form: "); // Ask the user for the probability of it raining today
        probability = scan.nextInt(); // Store the user's input under the probability variable

        if(probability >= 30) // Check if the probability is greater than 30 percent
            System.out.println("Bring your umbrella today."); // Inform the user that they will most likely need an umbrella
        else // If all other ifs are false
            System.out.println("Leave your umbrella at home today."); // Inform the user that they most likely won't need an umbrella
    } // End of main method
} // End of umbrellaIfStatementsProblem class
