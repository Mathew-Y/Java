import java.util.Scanner; // Importing Java Class
public class CarPurchaseProgram { // Start of carPurchaseProgram

    public static void main(String[] args) { // Start of main method

        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        final double BASE_PRICE = 15000.00; // Constant that stores the value of the base price
        final double FLOOR_MAT_PRICE = 100.00; // Constant that stores the value of the floor mat price
        final double DVD_PLAYER_PRICE = 500.00; // Constant that stores the value of the DVD player price
        final double LEATHER_SEAT_PRICE = 2000.00; // Constant that stores the value of the heated leather seat price
        final double WARRANTY_PRICE = 1500.00; // Constant that stores the value of the 5 year warranty price
        final double TAX = 0.13; // Constant that stores the value of the tax calculation
        double tax_price = 0.0; // Variable that will store the tax amount
        double total_cost = BASE_PRICE; // Variable that will store the total cost of the user's car
        String floor_mat_choice = null; // Variable that will store the user's floor mat choice input
        String dvd_player_choice = null;  // Variable that will store the user's DVD player choice input
        String leather_seat_choice = null; // Variable that will store the user's heated leather seat choice input
        String warranty_choice = null; // Variable that will store the user's warranty choice input

        System.out.format("%s %.2f %n","The base price of the car you are looking for is: $", BASE_PRICE); // Tells user base price
        System.out.format("%s %n %n", "Please select which features you want on the car [Y/N]"); // Tells user how to answer
        System.out.format("%s", "Would you like floor mats for an additional $100? "); // Ask if user wants floor mats
        floor_mat_choice = scan.nextLine(); // Store user's response under floor_mat_choice variable

        System.out.format("%s", "Would you like a DVD player for an additional $500? "); // Ask if user wants a DVD player
        dvd_player_choice = scan.nextLine(); // Store user's response under dvd_player_choice variable

        System.out.format("%s", "Would you like to add heated leather seats for an additional $2000? "); // Ask if user wants heated leather seats
        leather_seat_choice = scan.nextLine(); // Store user's response under leather_seat_choice variable

        System.out.format("%s", "Would you like to add an extended 5-year warranty for an additional $1500? "); // Ask if user wants 5 year warranty
        warranty_choice = scan.nextLine(); // Store user's response under warranty_choice

        System.out.format("%n"); // Add a line to organize output to the console

        //Start of "Receipt"
        System.out.format("%-30s $%.2f %n", "Base Price:", BASE_PRICE); // Output the base price to console in tabular format

        if(floor_mat_choice.equalsIgnoreCase("y")) { // True branch
            total_cost += FLOOR_MAT_PRICE; // Add floor mat's price to the total cost of car
            System.out.format("%-30s $%.2f %n", "Floor Mats:", FLOOR_MAT_PRICE); // Add floor mats to the receipt in tabular format
        } // End of true branch

        if(dvd_player_choice.equalsIgnoreCase("y")) { // True Branch
            total_cost += DVD_PLAYER_PRICE; // Add DVD player price to total cost of car
            System.out.format("%-30s $%.2f %n", "DVD Player:", DVD_PLAYER_PRICE); // Add DVD player to the receipt in tabular format
        } // End of true branch

        if(leather_seat_choice.equalsIgnoreCase("y")) { // True branch
            total_cost += LEATHER_SEAT_PRICE; // Add heated leather seat price to total cost of car
            System.out.format("%-30s $%.2f %n", "Heated Leather Seats:", LEATHER_SEAT_PRICE); // Add heated leather seats to the receipt in tabular format
        } // End of true branch

        if(warranty_choice.equalsIgnoreCase("y")) { // True branch
            total_cost += WARRANTY_PRICE; // Add warranty price to total cost of car
            System.out.format("%-30s $%.2f %n", "5-Year Extended Warranty:", WARRANTY_PRICE); // Add warranty to receipt in tabular format
        } // End of true branch

        tax_price = total_cost * TAX; // The tax price is 13% of the total cost (calculation)
        total_cost += tax_price; // Add tax price to the total cost for the cost after taxes

        System.out.format("%-30s $%.2f %n", "Tax:", tax_price); // Add the tax price to the receipt in tabular format
        System.out.format("%-30s $%.2f", "Total Cost:", total_cost); // Add the total cost to the receipt in tabular format
    } // End of main method
} // End of carPurchaseProgram class
