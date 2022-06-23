import java.util.Scanner; // Importing Scanner class
class depositInterestRateUserProblem { // Start of depositInterestRateUserProblem class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        double deposit = 0.0; // Variable that will store the user's deposit every year
        double balance = 0.0; // Variable that will store the user's current balance at any given moment
        double interest_rate = 0.0; // Variable that will store the user's inputted interest rate
        int year = 0; // Variable that will store the user's number of years

        System.out.print("Please enter how much you want to deposit every year: "); // Ask user for their deposit every year
        deposit = scan.nextDouble(); // Store deposit amount under deposit variable
        System.out.print("Please enter your interest rate in percentage form: "); // Ask user for the interest rate as a percentage
        interest_rate = scan.nextDouble(); // Store the interest rate under interest_rate variable
        System.out.print("Please enter the number of years you would like to display: ");
        year = scan.nextInt(); // Store the user's inputted number of years under year variable

        interest_rate = (interest_rate / 100) + 1; // Reinitialize the interest_rate variable into a multiplier form

        for(int i = 1; i <= year; i++) { // Start of for loop, counts from 1 to the number of years the user has chosen
            balance = (balance + deposit) * interest_rate; // Reinitialize the balance to the balance plus the extra deposit each year, all multiplied by the interest rate multiplier
            System.out.format("%s %d: $%.2f %n", "Year", i, balance); // Output the user's current balance at any iteration
        } // End of loop

    } // End of main method
} // End of depositInterestRateUserProblem class
