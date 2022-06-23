import java.util.Scanner; // Importing Scanner class
public class VaughanPrintingServices { // Start of vaughanPrintingServices class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        int copies = 0; // Variable that will store the user's number of copies
        int printingType = 0; // Variable that will store the user's choice of printing type
        int paperSize = 0; // Variable that will store the user's choice of paper size

        double pricePerPaper = 0.0; // Variable that will store the price for each paper
        final double doubleSidedConversion = 1.50; // Constant that will store the price conversion if the user wants to have double sided paper
        final double tax = 1.13; // Constant that will store the tax multiplier
        double totalPrice = 0.0; // Variable that will store the total price the user has to pay

        System.out.println("Welcome to Vaughan Printing Services! These are our prices: \n"); // Welcome the user


        System.out.format("%-15s%10s%14s%n", "# of Copies", "Letter", "Legal"); // Output titles for output
        System.out.format("%-19s%-15s%-15s%n", "------------", "----------", "----------"); // Output dashes to separate titles from data
        System.out.format("%-19s%-15s%-15s%n", "1 - 100", "$0.16 each", "$0.22 each"); // Output the prices for 1-100 copies
        System.out.format("%-19s%-15s%-15s%n", "101 - 250", "$0.12 each", "$0.16 each"); // Output the prices for 101-250 copies
        System.out.format("%-19s%-15s%-15s%n%n", "Over 250", "$0.08 each", "$0.12 each"); // Output the prices for over 250 copies

        System.out.print("Please enter the number of copies you would like: "); // Ask the user how many copies they want
        copies = scan.nextInt(); // Store their desired number of copies under the copies variable

        System.out.print("Choose paper size (1 - Letter, 2 - Legal): "); // Ask the user what paper size they want
        paperSize = scan.nextInt(); // Store their desired paper size under the paperSize variable

        if(copies >= 1 && copies <= 100) { // True branch
            if(paperSize == 1)  // Check if they want letter size
                pricePerPaper = 0.16; // Make the price 16 cents per paper
            else // If all other ifs evaluate to false
                pricePerPaper = 0.22; // Make the price 22 cents per paper
        } // End of true branch

        else if(copies >= 101 && copies <= 250) { // True branch
            if(paperSize == 1) // Check if they want letter size
                pricePerPaper = 0.12; // Make the price 12 cents per paper
            else // If all other ifs evaluate to false
                pricePerPaper = 0.16; // Make the price 16 cents per paper
        } // End of true branch

        else // If all other ifs evaluate to false
            if(paperSize == 1) // Check if they want letter size
                pricePerPaper = 0.08; // Make the price 8 cents per paper
            else // If all other ifs evaluate to false
                pricePerPaper = 0.12; // Make the price 12 cents per paper

        System.out.print("Choose printing type (1 - Single-Sided, 2 - Double-Sided): "); // Ask the user if they want single or double sided paper
        printingType = scan.nextInt(); // Store their decision under printingType variable

        if(printingType == 2) // If they want double-sided copies
            pricePerPaper *= doubleSidedConversion; // Multiply the price per paper by 1.5

        totalPrice = (pricePerPaper * copies) * tax; // Calculate the total cost by multiplying the price per paper by the number of copies, and multiplying everything by the tax multiplier

        System.out.format("%n%s%d%s$%.2f%s%n", "Total price for ", copies, " copies is ", totalPrice, " (includes taxes)"); // Output the total price to the user

    } // End of main method
} // End of vaughanPrintingServices class
