import java.util.Scanner;
public class ForLoopAnnualInterestProblem { // STart of forLoopAnnualInterestProblem

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        double amount = 6000.00; // Variable that will store the user's amount
        double interest = 0.0; // Variable that will store the annual interest that is payable on the loan
        final double interestRate = 12.5; // Constant that will store the interest rate of 12.5%
        int numOfYears = 0; // Variable that will store the current year

        System.out.print("Please enter the number of years for which the interest will be calculated: "); // Ask the user for the number of years for which the interest will be calculated
        numOfYears = scan.nextInt(); // Store the number of years under numOfYear variable

        for(int i = 1; i <= numOfYears; i++) { // Start of for loop, counts from 1 to numOfYears
            interest = amount * (interestRate / 100); // Calculate the interest
            System.out.format("%s%d: %.2f%n", "Year ", i , interest); // Output the interest for that year to the user
            amount -= 200; // Decrease the current amount by 200 each year
        } // End of for loop

    } // End of main method
} // End of forLoopAnnualInterestProblem class
