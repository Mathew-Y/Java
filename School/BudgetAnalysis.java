import java.util.Scanner; // Import the Scanner class

class budgetAnalysis { // Start of budgetAnalysis class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        String name = null; // String that will store the user's name
        double earnings = 0.0; // double that will store the user's monthly earnings
        double foodSpent = 0.0; // double that will store the amount the user spent on food last month
        double foodBudget = 0; // double that will store the user's food budget in percentage form
        double clothingSpent = 0.0; // double that will store the amount the user spent on clothing last month
        double clothingBudget = 0; // double that will store the user's clothing budget in percentage form
        double entertainmentSpent = 0.0; // double that will store the amount the user spent on entertainment last month
        double entertainmentBudget = 0; // double that will store the user's entertainment budget in percentage form
        double cellPhoneSpent = 0.0; // double that will store the amount the user spent on his cell phone in the last month
        double cellPhoneBudget = 0; // double that will store the user's cell phone budget in percentage form
        double expenses = 0.0; // double that will store the user's expenses in the last month
        double expensesPercentage = 0; // double that will store the user's expenses in percentage form compared to their monthly earnings
        double savings = 0.0; // Double that will store how much the user has saved in the last month
        double savingsPercentage = 0; // Double that will store the user's savings in percentage form compared to their monthly earnings

        System.out.print("Please enter your name: "); // Ask user to enter their name
        name = scan.nextLine(); // Store user input under name variable

        System.out.print("\nPlease enter how much you earned last month: "); // Ask the user for their monthly earnings
        earnings = scan.nextDouble(); // Store user input under earnings variable

        System.out.println("\nPlease enter how much you spent last month on the following: "); // Ask user how much they've spent on the following categories

        System.out.format("%-17s", "Food:"); // Ask how much the user has spent on food in the last month
        foodSpent = scan.nextDouble(); // Store the amount spent under foodSpent variable

        System.out.format("%-17s", "Clothing:"); // Ask how much the user has spent on clothing in the last month
        clothingSpent = scan.nextDouble(); // Store the amount spent under clothingSpent variable

        System.out.format("%-17s", "Entertainment:"); // Ask how much the user has spent on entertainment in the last month
        entertainmentSpent = scan.nextDouble(); // Store the amount spent under entertainmentSpend variable

        System.out.format("%-17s", "Cell Phone:"); // Ask how much the user has spent on their cell phone in the last month
        cellPhoneSpent = scan.nextDouble(); // Store the amount spent under cellPhoneSpent variable

        foodBudget = (foodSpent / earnings) * 100; // Calculate the user's food budget in percentage form compared to their earnings
        clothingBudget = (clothingSpent / earnings) * 100; // Calculate the user's clothing budget in percentage form compared to their earnings
        entertainmentBudget = (entertainmentSpent / earnings) * 100; // Calculate the user's entertainment budget in percentage form compared to their earnings
        cellPhoneBudget = (cellPhoneSpent / earnings) * 100; // Calculate the user's cell phone budget in percentage form compared to their earnings

        System.out.println("\n" + name + ", this is a summary of your spending pattern: \n"); // Preparation message for displaying their spending pattern in the last month

        System.out.format("%-20s%10s%n", "Category", "Budget"); // Chart titles
        System.out.format("%-20s%10s%n", "----------------", "------"); // Chart dashes to separate information from the titles
        System.out.format("%-23s%6.0f%s%n", "Food", foodBudget, "%"); // Display how much the user has spent on food in percentage form
        System.out.format("%-23s%6.0f%s%n", "Clothing", clothingBudget, "%"); // Display how much the user has spent on clothing in percentage form
        System.out.format("%-23s%6.0f%s%n", "Entertainment", entertainmentBudget, "%"); // Display how much the user has spent on entertainment in percentage form
        System.out.format("%-23s%6.0f%s%n%n", "Cell Phone", cellPhoneBudget, "%"); // Display how much the user has spent on their cell phone in percentage form

        expenses = foodSpent + clothingSpent + entertainmentSpent + cellPhoneSpent; // Calculate how much the user has spent in the past month
        expensesPercentage = (expenses / earnings) * 100; // Calculate the user's expenses in percentage form compared to their earnings

        savings = earnings - expenses; // Calculate how much the user has saved in the past month
        savingsPercentage = (savings / earnings) * 100; // Calculate the user's savings in percentage form compared to their earnings

        System.out.format("%s $%.2f%s%.0f%s%n", "Your expenses total", expenses, " or ", expensesPercentage, "% of earnings."); // Display the user's total expenses in numeric form and in percentage form
        System.out.format("%s $%.2f%s%.0f%s", "Your savings are", savings, " or ", savingsPercentage, "% of earnings."); // Display the user's total savings in numeric form and in percentage form
    } // End of main method
} // End of budgetAnalysis class
