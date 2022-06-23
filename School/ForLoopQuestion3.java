import java.util.Scanner; // Importing Scanner Class
public class ForLoopQuestion3 { // Start of forLoopQuestion3 class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        int starting_value = 0; // Variable that will store the user's desired starting value
        int decrementing_value = 0; // Variable that will store the user's desired decrementing value

        System.out.print("Please enter the number you would like to start at: "); // Ask user for starting value
        starting_value = scan.nextInt(); // Store input under starting_value variable
        System.out.print("Please enter the decrementing value: "); // Ask user for decrementing value
        decrementing_value = scan.nextInt(); // Store input under decrementing_value variable

        for(int count = starting_value; count >= 0; count -= decrementing_value) { // Start of for loop, counts from starting value to 0
            if((count - decrementing_value) < 0) { // True branch, if statement will check if this is the last iteration of the loop
                System.out.format("%d", count); // Print count without a comma since it is the last number
                break; // Break the loop
            } // End of true branch
            System.out.print(count + ", "); // Output the count value with a comma separating it from the next value
        } // End of for loop

    } // End of main method
} // End of forLoopQuestion3 class
