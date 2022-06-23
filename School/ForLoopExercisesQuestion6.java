/* Mathew Younan
   Mr. Ceccato
   May 4, 2020
   This program will ask the user for their deposit and interest rate, and will output their balance every year for 20 years of receiving interest and adding their deposit amount every year
 */
import java.util.Scanner; // Importing Scanner class
public class ForLoopExercisesQuestion6
{ // Start of forLoopExercisesQuestion6 class

    public static void main(String[] args)
    { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        double deposit = 0.0; // Variable that will store the user's deposit every year
        double balance = 0.0; // Variable that will store the user's current balance at any given moment
        double interest_rate = 0.0; // Variable that will store the user's inputted interest rate

            System.out.print("Please enter how much you want to deposit every year: "); // Ask user for their deposit every year
            deposit = scan.nextDouble(); // Store deposit amount under deposit variable
            System.out.print("Please enter your interest rate in percentage form: "); // Ask user for the interest rate as a percentage
            interest_rate = scan.nextDouble(); // Store the interest rate under interest_rate variable

            interest_rate = (interest_rate / 100) + 1; // Reinitialize the interest_rate variable into a multiplier form

                for(int i = 1; i <= 20; i++) // Count 20 times
                { // Start of loop
                    balance = (balance + deposit) * interest_rate; // Reinitialize the balance to the balance plus the extra deposit each year, all multiplied by the interest rate multiplier
                    System.out.format("%s %d: $%.2f %n", "Year", i, balance); // Output the user's current balance at any iteration
                } // End of loop

    } // End of main method
} // End of forLoopExercisesQuestion6 class
