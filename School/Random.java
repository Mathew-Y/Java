/*
Ryan Pleava
Dec 14, 2020
ICS4U-1
Mr. Hofstatter
                         1.10.4 Grade Converter Assignment
This is a program that prompts the user to input a student's name, their average in
%-form, and their respective subject.
 */
import java.util.*;
public class Random {

    // STRING INPUT VERIFIER
    public static boolean verifyString(String input) {
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
            } else {
                return false;
            }
        }
        return true;
    }

    // NUM INPUT VERIFIER
    public static boolean verifyNum(String input) {
        try {
            double holdInput = Double.parseDouble(input);
            if (0 <= holdInput && holdInput <= 100) {
                return true;
            }
            return false;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    // DISPLAY REPORT CARD METHOD
    public static void displayReport(ArrayList<String[]> report) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max4 = 0;
        int max5 = 0;
        for (int i = 0; i < report.size(); i++) {
            if (report.get(i)[0].length() > max1) {
                max1 = report.get(i)[0].length();
            }
            if (report.get(i)[1].length() > max2) {
                max2 = report.get(i)[1].length();
            }
            if (report.get(i)[2].length() > max3) {
                max3 = report.get(i)[3].length();
            }
            if (report.get(i)[3].length() > max4) {
                max4 = report.get(i)[3].length();
            }
            if(report.get(i)[3].length() > max5){
                max5 = report.get(i)[4].length();
            }
        }

    }

    public static void main(String[] args) {

    }
}