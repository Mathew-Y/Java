/*
Robert Dobos
ICS4U1
May 4, 2021
This program will prompt the user to enter their monthly talk minutes, text messages, and
summer percentage increase and it will output their summer bill for Bell, Rogers, and Freedom
 */

import java.util.Scanner; // Import Scanner class

public class MobilePlanTracker { // Start of MobilePlanTracker class

    public static void main(String[] args) { // Start of main method

        // Declaration of all necessary variables
        int talkMinutes = 0;
        int textMessages = 0;
        final int ACTIVATION = 35;
        final int bellMonthlyCost = 35;
        final int rogersMonthlyCost = 50;
        final int freedomMonthlyCost = 35;
        final int bellMonthlyMinutes = 250;
        final int rogersMonthlyMinutes = 200;
        final int freedomMonthlyMinutes = 300;
        final double bellAdditionalMinutes = 0.4;
        final double rogersAdditionalMinutes = 0.3;
        final double freedomAdditionalMinutes = 0.35;
        final double bellTextPrice = 0.15;
        final double rogersTextPrice = 0.1;
        final double freedomTextPrice = 0.15;
        double summerTalkMinutes = 0.0;
        double summerTextMessages = 0.0;
        double percentage = 0.0;
        double percentageIncrease = 0.0;
        double bellJunePrice = 0.0;
        double bellJulyPrice = 0.0;
        double bellAugustPrice = 0.0;
        double bellAverage = 0.0;
        double rogersJunePrice = 0.0;
        double rogersJulyPrice = 0.0;
        double rogersAugustPrice = 0.0;
        double rogersAverage = 0.0;
        double freedomJunePrice = 0.0;
        double freedomJulyPrice = 0.0;
        double freedomAugustPrice = 0.0;
        double freedomAverage = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your estimated number of talk minutes: "); // Ask the user for their number of talk minutes
        talkMinutes = scanner.nextInt(); // Store user's talk minutes under talkMinutes variable

        System.out.print("Enter your estimated number of text messages: "); // Ask the user for their number of text messages
        textMessages = scanner.nextInt(); // Store user's text message count under textMessages variable

        System.out.print("Enter anticipated percentage increase in the summer: "); // Ask the user for their percentage summer increase
        percentageIncrease = scanner.nextDouble(); // Store their percentage increase under percentageIncrease variable

        percentage = (percentageIncrease / 100) + 1; // Put their percentage in multiplicative form

        summerTalkMinutes = talkMinutes * percentage; // Calculate the user's summer talk minutes
        summerTextMessages = textMessages * percentage; // Calculate the user's summer text messages


        if(talkMinutes > bellMonthlyMinutes) { // Start of if block
            // Calculates Bell prices if their talk minutes are greater than bell's monthly minutes
            bellJunePrice = (ACTIVATION + bellMonthlyCost) + ((talkMinutes - bellMonthlyMinutes) * bellAdditionalMinutes) + (textMessages * bellTextPrice);
            bellJulyPrice = bellMonthlyCost + ((summerTalkMinutes - bellMonthlyMinutes) * bellAdditionalMinutes) + (summerTextMessages * bellTextPrice);
            bellAugustPrice = bellMonthlyCost + ((summerTalkMinutes - bellMonthlyMinutes) * bellAdditionalMinutes) + (summerTextMessages * bellTextPrice);
        } // End of if block
        else { // Start of else block
            // Calculates Bell prices if their talk minutes are less than bell's monthly minutes
            bellJunePrice = (ACTIVATION + bellMonthlyCost) + (textMessages * bellTextPrice);
            if(summerTalkMinutes > bellMonthlyMinutes) { // Start of if block
                bellJulyPrice = bellMonthlyCost + ((summerTalkMinutes - bellMonthlyMinutes) * bellAdditionalMinutes) + (summerTextMessages * bellTextPrice);
                bellAugustPrice = bellMonthlyCost + ((summerTalkMinutes - bellMonthlyMinutes) * bellAdditionalMinutes) + (summerTextMessages * bellTextPrice);
            } // End of if block
            else { // Start of else block
                bellJulyPrice = bellMonthlyCost + (summerTextMessages * bellTextPrice);
                bellAugustPrice = bellMonthlyCost + (summerTextMessages * bellTextPrice);
            } // End of else block
        } // End of else block


        if(talkMinutes > rogersMonthlyMinutes) { // Start of if block
            // Calculates Rogers prices if their talk minutes are greater than rogers' monthly minutes
            rogersJunePrice =  rogersMonthlyCost + ((talkMinutes - rogersMonthlyMinutes) * rogersAdditionalMinutes) + (textMessages * rogersTextPrice);
            rogersJulyPrice = rogersMonthlyCost + ((summerTalkMinutes - rogersMonthlyMinutes) * rogersAdditionalMinutes) + (summerTextMessages * rogersTextPrice);
            rogersAugustPrice = rogersMonthlyCost + ((summerTalkMinutes - rogersMonthlyMinutes) * rogersAdditionalMinutes) + (summerTextMessages * rogersTextPrice);
        } // End of if block
        else { // Start of else block
            // Calculates Rogers prices if their talk minutes are less than Rogers' monthly minutes
            rogersJunePrice = (ACTIVATION + rogersMonthlyCost) + (textMessages * rogersTextPrice);
            if(summerTalkMinutes > rogersMonthlyMinutes) { // Start of if block
                rogersJulyPrice = rogersMonthlyCost + ((summerTalkMinutes - rogersMonthlyMinutes) * rogersAdditionalMinutes) + (summerTextMessages * rogersTextPrice);
                rogersAugustPrice = rogersMonthlyCost + ((summerTalkMinutes - rogersMonthlyMinutes) * rogersAdditionalMinutes) + (summerTextMessages * rogersTextPrice);
            } // End of if block
            else { // Start of else block
                rogersJulyPrice = rogersMonthlyCost + (summerTextMessages * rogersTextPrice);
                rogersAugustPrice = rogersMonthlyCost + (summerTextMessages * rogersTextPrice);
            } // End of else block
        } // End of else block


        if(talkMinutes > freedomMonthlyMinutes) { // Start of if block
            // Calculates Freedom prices if their talk minutes are less than Freedom's monthly minutes
            freedomJunePrice =  (freedomMonthlyCost + ACTIVATION) + ((talkMinutes - freedomMonthlyMinutes) * freedomAdditionalMinutes) + (textMessages * freedomTextPrice);
            freedomJulyPrice = freedomMonthlyCost + ((summerTalkMinutes - freedomMonthlyMinutes) * freedomAdditionalMinutes) + (summerTextMessages * freedomTextPrice);
            freedomAugustPrice = freedomMonthlyCost + ((summerTalkMinutes - freedomMonthlyMinutes) * freedomAdditionalMinutes) + (summerTextMessages * freedomTextPrice);
        } // End of if block
        else { // Start of else block
            // Calculates Freedom prices if their talk minutes are less than Freedom monthly minutes
            freedomJunePrice = (ACTIVATION + freedomMonthlyCost) + (textMessages * freedomTextPrice);
            if(summerTalkMinutes > freedomMonthlyMinutes) { // Start of if block
                freedomJulyPrice = freedomMonthlyCost + ((summerTalkMinutes - freedomMonthlyMinutes) * freedomAdditionalMinutes) + (summerTextMessages * freedomTextPrice);
                rogersAugustPrice = freedomMonthlyCost + ((summerTalkMinutes - freedomMonthlyMinutes) * freedomAdditionalMinutes) + (summerTextMessages * freedomTextPrice);
            } // End of if block
            else { // Start of else block
                freedomJulyPrice = freedomMonthlyCost + (summerTextMessages * freedomTextPrice);
                freedomAugustPrice = freedomMonthlyCost + (summerTextMessages * freedomTextPrice);
            } // End of else block
        } // End of else block

        bellAverage = (bellJunePrice + bellJulyPrice + bellAugustPrice) / 3; // Calculates the average of bell prices
        rogersAverage = (rogersJunePrice + rogersJulyPrice + rogersAugustPrice) / 3; // Calculates the average of rogers prices
        freedomAverage = (freedomJunePrice + freedomJulyPrice + freedomAugustPrice) / 3; // Calculates the average of freedom prices


        // Output data in tabular format
        System.out.format("%n%-16s%-19s%-20s%s%n", "Month", "Bell Mobility", "Rogers Wireless", "Freedom Mobile");
        System.out.format("%-16s%-19s%-20s%s%n", "--------", "-------------", "---------------", "--------------");
        System.out.format("%-23s$%-20.2f$%-18.2f$%.2f%n", "June", bellJunePrice, rogersJunePrice, freedomJunePrice);
        System.out.format("%-23s$%-20.2f$%-18.2f$%.2f%n", "July", bellJulyPrice, rogersJulyPrice, freedomJulyPrice);
        System.out.format("%-23s$%-20.2f$%-18.2f$%.2f%n%n", "August", bellAugustPrice, rogersAugustPrice, freedomAugustPrice);
        System.out.format("%-23s$%-20.2f$%-18.2f$%.2f%n", "Average", bellAverage, rogersAverage, freedomAverage);
    } // End of main method
} // End of MobilePlanTracker class
