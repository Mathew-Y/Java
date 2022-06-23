import java.util.Scanner; // Importing Scanner class

public class CanadianCapitalCityQuiz { // Start of canadianCapitalCityQuiz

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        String guess = null; // String that will store the user's guess
        double percentage = 0.0; // Variable that will store the user's mark in percentage form
        double totalCorrect = 0; // Variable that will store the number of questions the user answered correctly
        final int numOfQuestions = 13; // Constant that will store the number of questions in the quiz

        System.out.println("CANADIAN CAPITAL CITY QUIZ\n"); // Quiz message at the top

        System.out.println("What is the capital of Alberta?"); // Ask user what the capital of Alberta is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("edmonton")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Edmonton.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of British Columbia?"); // Ask user what the capital of British Columbia is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("victoria")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Victoria.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Manitoba?"); // Ask user what the capital of Manitoba is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("winnipeg")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Winnipeg.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of New Brunswick?"); // Ask user what the capital of New Brunswick is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("fredericton")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Fredericton.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Newfoundland and Labrador?"); // Ask user what the capital of Newfoundland and Labrador is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("St. John's")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is St. John's.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Northwest Territories?"); // Ask user what the capital of Northwest Territories is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Yellowknife")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Yellowknife.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Nova Scotia?"); // Ask user what the capital of Nova Scotia is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Halifax")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Halifax.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Nunavut?"); // Ask user what the capital of Nunavut is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Iqaluit")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Iqaluit.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Ontario?"); // Ask user what the capital of Ontario is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Toronto")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Toronto.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Price Edward Island?"); // Ask user what the capital of Prince Edward Island is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Charlottetown")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Charlottetown.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Quebec?"); // Ask user what the capital of Quebec is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("quebec city")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct. \n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Quebec City.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Saskatchewan?"); // Ask user what the capital of Saskatchewan is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("Regina")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Regina.\n"); // Tell user they answered incorrectly, tell them correct answer

        System.out.println("What is the capital of Yukon?"); // Ask user what the capital of Yukon is
        guess = scan.nextLine(); // Store their guess under variable guess

        if (guess.equalsIgnoreCase("whitehorse")) { // True branch
            totalCorrect++; // Increment totalCorrect variable
            System.out.println("Correct.\n"); // Tell user they answered correctly
        } // End of true branch
        else // If all if statements evaluate to false
            System.out.println("Wrong. The capital city is Whitehorse.\n"); // Tell user they answered incorrectly, tell them correct answer

        percentage = (totalCorrect / numOfQuestions) * 100; // Calculate user's mark in percentage form

        System.out.format("%.0f%s%n", percentage, "% of your answers were correct."); // Inform user how well they did on the quiz

        if (percentage >= 80 && percentage <= 100) // Check if they got between 80 and 100
            System.out.println("Excellent."); // Tell the user their performance was excellent
        else if (percentage >= 70 && percentage <= 79) // Check if they got between 70 and 79
            System.out.println("Good."); // Tell the user their performance was good
        else if (percentage >= 60 && percentage <= 69) // Check if they got between 60 and 69
            System.out.println("Satisfactory."); // Tell the user their performance was satisfactory
        else if (percentage >= 50 && percentage <= 59) // Check if they got between 50 and 59
            System.out.println("Poor."); // Tell the user their performance was poor
        else // If all if statements evaluate to false (fail)
            System.out.println("Try again after you have studied more."); // Tell user to try again after studying more

        /*

         */

    } // End of main method
} // End of canadianCapitalCityQuiz
