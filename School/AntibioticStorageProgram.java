// PLEASE READ: I put the first month outside of the while loop because the effectiveness is 100.00, a 5 digit number which needs a different spacing than the rest on the table

public class AntibioticStorageProgram { // Start of antibioticStorageProgram class

    public static void main(String[] args) { // Start of main method
        final double fourPercentMultiplier = 0.96; // Constant that will store the four percent deduction multiplier
        final double expirationEffectiveness = 50; // Constant that will store the percentage of expiration
        double effectiveness = 100; // Variable that will store the effectiveness of the antibiotic
        int month = 0; // Variable that will store the month which will be used to compare the effectiveness

        System.out.format("%-22s %s %n", "MONTH", "EFFECTIVENESS"); // Output headers of chart
        System.out.format("%-27d %.2f %c %n", month, effectiveness, '%'); // Output only the 100.00 effectiveness because it has more digits

        month++; // Increase the month by 1
        effectiveness *= fourPercentMultiplier; // Reinitialize the effectiveness to its effectiveness after one month

        while(effectiveness >= expirationEffectiveness) { // Will stop when antibiotic is expired, True branch
            System.out.format("%-28d %.2f %c %n", month, effectiveness, '%'); // Output the month and corresponding effectiveness in tabular format
            month++; // Increase the month by 1
            effectiveness *= fourPercentMultiplier; // Reinitialize the effectiveness to its effectiveness after one month
        } // End of true branch

        System.out.format("%-28d %.2f %c %10s %n", month, effectiveness, '%', "DISCARD!"); // Outputs the month of expiration and its effectiveness during this month

    } // End of main method
} // End of antibioticStorageProgram class
