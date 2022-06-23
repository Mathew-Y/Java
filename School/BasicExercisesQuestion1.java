import java.util.Scanner; // Importing Scanner class
public class BasicExercisesQuestion1 {

    public static void main(String[] args) // Main method
    {
        Scanner scan = new Scanner(System.in); // Creating Scanner called scan
        final int dollar = 100; // constant used for dollar value
        int input = 0; // variable that will take user's inputted cent amount
        int dollar_count = 0; // variable that will be used to calculate the amount of dollars
        int new_cents = 0; // variable that will be equal to the remainder cents after conversion to dollars

        System.out.print("Please enter an amount of cents: "); // Ask user for cent amount
        input = scan.nextInt(); // Save number under input variable

        if(input >= dollar) // if statement that will check if the cent amount is greater than 100 and can be converted
        {
            dollar_count = input / dollar; // Calculation of the amount of dollars
            new_cents = input - (dollar_count * dollar); // Calculation of the new amount of cents
            System.out.println("That is " + dollar_count + " dollars and " + new_cents + " cents."); // Final print to console
        }
        else // if the boolean of the if statement above is false, run this (less than 100 cents)
        {
            System.out.println("That is " + input + " cents."); // Final print to console
        }
    }
}
