import java.util.Scanner; // Importing Scanner Class
public class FantasyGame
{ // Start of fantasyGame class

    public static void main(String[] args)
    { // Start of main method

        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        String username = null; // Variable that will store the user's username
        int user_strength = 0; // Variable that will store the user's strength in an int
        int user_health = 0; // Variable that will store the user's health in an int
        int user_luck = 0; // Variable that will store the user's luck in an int
        int points_greater_10 = 0; // Variable that will be used if the user's points remaining is greater than 10
        int max_value = 0; // Variable that will be used to find the max value that the user can enter for their stats
        String strength_string = null; // Variable that will store the user's inputted strength in a String to parse
        String health_string = null; // Variable that will store the user's inputted health in a String to parse
        String luck_string = null; // Variable that will store the user's inputted luck in a String to parse
        int points_remaining = 15; // Variable that will keep track of the user's points remaining
        boolean is_strength_valid = false; // Variable that will be used to check if the user's inputted strength is valid
        boolean is_health_valid = false; // Variable that will be used to check if the user's inputted health is valid
        boolean is_luck_valid = false; // Variable that will be used to check if the user's inputted luck is valid

            while(points_remaining >= 0)
            { // True branch

                System.out.print("Enter the name of your character: "); // Ask user for username
                username = scan.nextLine(); // Store username under username variable
                System.out.println("Welcome " + username + "!"); // Welcome the user to the game

                    while (!is_strength_valid)
                    { // True branch
                        System.out.print("Enter your desired strength (1-10), " + username + " (" + points_remaining + " remaining): "); // Ask user for strength between 1-10
                        strength_string = scan.nextLine(); // Store input under a strength string
                            try
                            { // Try the following
                                user_strength = Integer.parseInt(strength_string); // Parse the user's String to an int

                                    if (user_strength >= 1 && user_strength <= 10)
                                    { // True branch
                                        is_strength_valid = true; // Break the loop if the user inputted an int between 1-10
                                    } // End of true branch
                                    else
                                    { // If they didn't enter a number between 1-10
                                        System.out.println("Please enter a number between 1 and 10."); // Tell user to enter an int between 1-10
                                    } // End of else
                            } // End of try
                            catch (NumberFormatException ex) // Catch a possible error where the user doesn't enter an int
                            { // Do the following if this is the case
                                System.out.println("This is not an integer."); // Tell user that they did not enter an int
                            } // End of catch
                    } // End of while

                points_remaining -= user_strength; // Update the points remaining after user entered their strength

                    while (!is_health_valid)
                    { // True branch
                        max_value = Math.min(points_remaining, 10); // Assign max_value to the minimum between 10 and the points remaining

                            if (points_remaining > 10)
                            { // True branch
                                points_greater_10 = 15 - points_remaining; // Make the variable points_greater_10 = 15 - points remaining to check the minimum amount the user has to enter for the second stat
                                System.out.print("Enter your desired health (" + points_greater_10 + "-" + max_value + "), " + username + " (" + points_remaining + " remaining): "); // Ask user for health stat between the points_greater_10 and the max_value variable
                                    try
                                    { // Try this
                                        health_string = scan.nextLine(); // Store user's input into a String
                                        user_health = Integer.parseInt(health_string); // Parse the String to an int

                                            if (user_health >= points_greater_10 && user_health <= max_value)
                                            { // True branch
                                                is_health_valid = true; // Break loop since user entered valid int
                                            } // End of true branch
                                            else
                                            { // If their input doesn't follow the condition above
                                                System.out.println("Please enter a number between " + points_greater_10 + " and " + (max_value - 1)); // Tell user to choose an int between the points_greater_10 variable
                                                // and the max_value variable - 1 because the last stat has to have a value of at least 1
                                            } // End of else
                                    } // End of try
                                    catch (NumberFormatException ex)
                                    { // Catch error where user doesn't enter an int
                                        System.out.println("This is not an integer."); // Tell user that they didn't enter an int
                                    } // End of catch
                            } // End of true branch
                            else if (points_remaining <= 10)
                            { // True branch
                                System.out.print("Enter your desired health (1-" + (max_value - 1) + "), " + username + " (" + points_remaining + " remaining): "); // Tell user to input a number between 1 and the
                                // max_value - 1 so the last stat can have a value of at least 1
                                    try
                                    { // Try this
                                        health_string = scan.nextLine(); // Store input under a String
                                        user_health = Integer.parseInt(health_string); // Parse the String to an int

                                            if (user_health >= 1 && user_health <= (max_value - 1))
                                            { // True branch
                                                is_health_valid = true; // Break loop if the input was a valid int
                                            } // End of true branch
                                            else
                                            { // If their input wasn't an int between 1 and the max value - 1
                                                System.out.println("Please enter a number between 1 and " + (max_value - 1)); // Tell user to input an int between 1 and the max value - 1
                                            } // End of else
                                    } // End of try
                                    catch (NumberFormatException ex)
                                    { // If the user didn't input an int
                                        System.out.println("This is not an integer."); // Tell user that they didn't input an int
                                    } // End of catch
                            } // End of true branch
                    } // End of while

                points_remaining -= user_health; // Update the points remaining after user entered their health

                user_luck = points_remaining; // Default the luck value to the remaining points of the user

                System.out.println(username + ",\nYour strength is: " + user_strength); // Output the user's strength
                System.out.println("Your health is: " + user_health); // Output the user's health
                System.out.println("Your luck is: " + user_luck); // Output the user's luck
                break; // Break out of the game loop
            } // End of game loop
    } // End of main method
} // End of fantasyGame class
