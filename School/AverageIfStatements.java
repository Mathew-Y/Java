import java.util.Scanner; // Importing Scanner class
public class AverageIfStatements { // Beginning of averageIfStatements Class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of scanner named scan, will be used to receive marks
        double mark1 = 0.0; // will be used to save the user's first grade
        double mark2 = 0.0; // will be used to save the user's second grade
        double mark3 = 0.0; // will be used to save the user's third grade
        double mark4 = 0.0; // will be used to save the user's fourth grade
        final int mark_count = 4; // Constant that will store the number of marks
        double average = 0.0; // Will be used to calculate the average based on the 4 marks entered by the user

        System.out.print("Please enter the first mark: "); // Ask user for first mark
        mark1 = scan.nextDouble(); // Save the mark under mark1 variable
        System.out.print("Please enter the second mark: "); // Ask user for second mark
        mark2 = scan.nextDouble(); // Save the mark under mark2 variable
        System.out.print("Please enter the third mark: "); // Ask user for third mark
        mark3 = scan.nextDouble(); // Save the mark under mark3 variable
        System.out.print("Please enter the fourth mark: "); // Ask user for fourth mark
        mark4 = scan.nextDouble(); // Save the mark under mark4 variable

        average = (mark1 + mark2 + mark3 + mark4) / mark_count; // Adding marks and dividing by 4 to get the average

        if(average >= 80) // Is average greater than or equal to 80?
            System.out.println("Keep up the good work."); // Runs if condition is true
        else if(average >= 60 && average < 80) // If the first if condition is false, check if average is between 60 and 80
            System.out.println("Satisfactory, but there is room for improvement."); // Runs if condition is true
        else // If both other conditions are false
            System.out.println("Greater effort is needed."); // Run this line of code

    } // End of main method
} // End of averageIfStatements class
