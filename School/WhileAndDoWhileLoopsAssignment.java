import java.util.Scanner; // Importing Scanner class
public class WhileAndDoWhileLoopsAssignment
{ // Start of whileAndDoWhileLoopsAssignment

    public static void main(String[] args)
    { // Start of main method

        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        double balance = 0.0; // Variable that will store the user's unpaid balance
        double monthly_interest = 0.0; // Variable that will store the monthly interest of the bank
        double monthly_payment = 0.0; // Variable that will store the user's desired monthly payment
        double total_payment = 0.0; // Variable that will store the total amount the user has currently paid
        int month = 1; // Variable that will store the current month

            System.out.print("Please enter your balance: "); // Ask the user for the unpaid balance
            balance = scan.nextDouble(); // Store the unpaid balance under balance variable
            System.out.print("Please enter the monthly interest in percentage form: "); // Ask the user for the monthly interest in percentage form
            monthly_interest = scan.nextDouble(); // Store the monthly interest under monthly_interest variable
            System.out.print("Please enter the monthly payment: "); // Ask user for their desired monthly payment
            monthly_payment = scan.nextDouble(); // Store the monthly payment under monthly_payment variable

            monthly_interest = (monthly_interest / 100) + 1; // Reinitialize the monthly_interest variable into a multiplier form

                do
                { // Start of do branch
                    balance = (balance * monthly_interest) - monthly_payment; // Reinitialize the balance to what it will be next month (multiplied by the interest rate and subtracted by the monthly payment)
                    total_payment += monthly_payment; // Add the monthly payment to the total_payment variable to show the user how much is paid each month
                    System.out.format("%s: %-10d %s: %-10.2f %s: %.2f %n", "Month", month, "Balance", balance, "Total Payments", total_payment); // Output data in tabular form
                    month++; // Increase the month by 1
                } // End of do branch

                while(balance > monthly_payment); // Check if the balance is greater than the monthly payment. If this is the case, perform the do branch again

            // When the program reaches here, the balance is less than the monthly payment
            monthly_payment = balance; // Make the next monthly payment equal to the remaining balance exactly
            balance -= monthly_payment; // Subtract the monthly payment from the balance (Will equal 0)
            total_payment += monthly_payment; // Add the new monthly payment to the user's total payment
            month++; // Increase the month by 1
            System.out.format("%s: %-10d %s: %-10.2f %s: %.2f %n", "Month", month, "Balance", balance, "Total Payments", total_payment); // Output the final line of data in tabular format

    } // End of main method
} // End of whileAndDoWhileLoopsAssignment

