/* Mathew Younan
   Mr. Ceccato
   April 20, 2020
   This program will ask the user for 5 marks, and the average will be calculated and outputted to the user
 */
import java.util.Scanner; // Importing Scanner class
public class BasicExercisesQuestion3 // Beginning of Question 3 Class
{

    public static void main(String[] args) // Main method
    {
        Scanner scan = new Scanner(System.in); // Creation of scanner named scan, will be used to receive marks
        double mark1 = 0.0; // will be used to save the user's first mark
        double mark2 = 0.0; // will be used to save the user's second mark
        double mark3 = 0.0; // will be used to save the user's third mark
        double mark4 = 0.0; // will be used to save the user's fourth mark
        double mark5 = 0.0; // will be used to save the user's fifth mark
        double average = 0.0; // Will be used to calculate the average based on the 5 marks entered by the user

            System.out.print("Please enter the first mark: "); // Ask user for first mark
            mark1 = scan.nextDouble(); // Save the mark under mark1 variable
            System.out.print("Please enter the second mark: "); // Ask user for second mark
            mark2 = scan.nextDouble(); // Save the mark under mark2 variable
            System.out.print("Please enter the third mark: "); // Ask user for third mark
            mark3 = scan.nextDouble(); // Save the mark under mark3 variable
            System.out.print("Please enter the fourth mark: "); // Ask user for fourth mark
            mark4 = scan.nextDouble(); // Save the mark under mark4 variable
            System.out.print("Please enter the fifth mark: ");// Ask user for fifth mark
            mark5 = scan.nextDouble(); // Save the mark under mark5 variable

            average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5; // Adding marks and dividing by 5 to get the average

            System.out.println(""); // Separate the mark entering and the final outputs of the program in the console

            System.out.println("The marks you entered were: " + mark1 + ", " + mark2 + ", " +
                    mark3 + ", " + mark4 + ", " + mark5); // Output the marks that the user entered
            System.out.println("The class average is: " + average + "%."); // Output the average to the user

    } // End of main method
} // End of question 3 class
