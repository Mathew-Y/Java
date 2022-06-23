import java.util.Scanner;
class Pantry
{ // Start of Pantry class
    Jam[] jam_jars = new Jam[3]; // Array of Jam class which will hold all the jam jars in the pantry. I used an array to be able to index it easier in the select method
    int selected = 0; // integer which will be responsible for holding the currently selected jar of jam

    Pantry(Jam jar1, Jam jar2, Jam jar3)
    { // Start of Pantry constructor
        this.jam_jars[0] = jar1; // Assign the first index in the jam_jars array to the parameter passed in as jar1
        this.jam_jars[1] = jar2; // Assign the second index in the jam_jars array to the parameter passed in as jar2
        this.jam_jars[2] = jar3; // Assign the third index in the jam_jars array to the parameter passed in as jar3
    } // End of Pantry constructor

    void print()
    { // Start of print method
        for (Jam jar : jam_jars)
            System.out.println("1. " + jar.type + " " + jar.expiry_date + " " + jar.size + " fl oz."); // Output message for the first jar of jam
        System.out.println();
    } // End of print method

    void select(int choice)
    { // Start of select method
            if (choice == selected + 1) // If the choice is currently selected
                System.out.println("You have already selected this jar of jam.\n"); // Tell the user that you have already selected this jar
            else if (choice >= 1 && choice <= 3)
            { // Start of else if block
                selected = choice - 1; // Assign the selected to 1 less of the choice to be able to access it in the array
                System.out.println("You have selected " + jam_jars[selected].type + ".\n"); // Tell the user that the new jar has been selected
            } // End of else if block
            else
                System.out.println("Please select a valid jar number (1, 2, or 3)\n"); // Tell the user to select either 1, 2, 3
    } // End of select method

    void spread(double amount)
    { // Start of spread method
            if (amount <= jam_jars[selected].size) // If the amount they chose is less than what is in the selected jar
            { // Start of if block
                jam_jars[selected].size -= amount; // Subtract the amount from the total size of the jar they have selected
                System.out.println("You have spread " + amount + " fl oz. of " + jam_jars[selected].type + " jam. You now have " + jam_jars[selected].size + " fl oz. remaining.\n"); // Tell the user they have spread the desired amount of the selected jar
            } // End of if block
            else
                System.out.println("You do not have enough jam to spread.\n"); // Tell the user they don't have enough jam in the selected jar to spread the desired amount
    } // End of spread method

    Pantry[] Add_Element(Pantry[] pantries, Pantry pantry)
    { // Start of Add_Element method
        int length = pantries.length; // int which will store the length of the array passed in
            Pantry[] new_array = new Pantry[length + 1]; // Create a new array with the size of the array passed in, plus one
                for(int i = 0; i < length; i++)
                    new_array[i] = pantries[i]; // Copy each element in the array
            new_array[length] = pantry; // Set the last element equal to the pantry passed in
            return new_array; // Return the new array back to the main method
    } // End of Add_Element method
} // End of Pantry class

class Jam
{ // Start of Jam class
    String type = ""; // String that will store the type of jam
    double size = 0.0; // Double that will store the size or amount of jam in the jar
    String expiry_date = ""; // String that will store the expiry date in the format "xx/xx/20xx"

    Jam(String type, double size, String expiry_date)
    { // Start of Jam constructor
        this.type = type; // Assign the class variable "type" to be equal to the parameter passed in when creating an instance of the class
        this.size = size; // Assign the class variable "size" to be equal to the parameter passed in when creating an instance of the class
        this.expiry_date = expiry_date; // Assign the class variable "expiry_date" to be equal to the parameter passed in when creating an instance of the class
    } // End of Jam constructor
} // End of Jam class

public class Pantry_Tester
{ // Start of Pantry_Tester class

    public static void main(String[] args)
    { // Start of main method

        Scanner scanner = new Scanner(System.in); // Scanner called scanner which will allow us to take user input
        scanner.useDelimiter("\\n"); // Removes all new line inputs to prevent a bug in which it skips a question because of the enter button being pressed
        String jam1_name = ""; // String which will store the name of the first jam jar
        double jam1_size = 0.0; // String which will store the size of the first jam jar
        String jam1_expiry = ""; // String which will store the expiry date of the first jam jar
        String jam2_name = "";  // String which will store the name of the second jam jar
        double jam2_size = 0.0; // String which will store the size of the second jam jar
        String jam2_expiry = ""; // String which will store the expiry date of the second jam jar
        String jam3_name = ""; // String which will store the name of the third jam jar
        double jam3_size = 0.0; // String which will store the size of the third jam jar
        String jam3_expiry = ""; // String which will store the expiry date of the third jam jar
        Pantry[] pantries = new Pantry[0]; // Create a pantry array to keep track of the pantries the user created
        Pantry current_pantry = null; // Pantry which will store the current pantry the user is using
        String user_choice = ""; // String which will store the user input
        int pantry_number = 1; // Int which will assign numbers to each pantry being used
        int jar_selection = 7; // int which will store the jar the user selected when calling the select method
        double spread_amount = 0.0; // double which will store the amount the user wants to spread
        int i = 0; // int which will keep track of the number of each pantry

                while(true)
                { // Start of pantry creation loop
                    System.out.print("Please enter the flavour of your first jam jar: "); // Ask the user for the name of the first jar of jam
                    jam1_name = scanner.next(); // Store user input under jam1_name

                    System.out.print("Please enter the size of this jam jar (fl oz.): "); // Ask the user for the size of the first jar of jam
                    jam1_size = scanner.nextDouble(); // Store user input under jam1_size

                    System.out.print("Please enter the expiry date of this jam (xx/xx/20xx): "); // Ask the user for the expiry date of the first jar of jam
                    jam1_expiry = scanner.next(); // Store user input under jam1_expiry

                    System.out.print("\n\nPlease enter the flavour of your second jam jar: "); // Ask the user for the name of the second jar of jam
                    jam2_name = scanner.next(); // Store user input under jam2_name

                    System.out.print("Please enter the size of this jam jar (fl oz.): "); // Ask the user for the size of the second jar of jam
                    jam2_size = scanner.nextDouble(); // Store user input under jam2_size

                    System.out.print("Please enter the expiry date of this jam (xx/xx/20xx): "); // Ask the user for the expiry date of the second jar of jam
                    jam2_expiry = scanner.next(); // Store user input under jam2_expiry

                    System.out.print("\n\nPlease enter the flavour of your third jam jar: "); // Ask the user for the name of the third jar of jam
                    jam3_name = scanner.next(); // Store user input under jam3_name

                    System.out.print("Please enter the size of this jam jar (fl oz.): "); // Ask the user for the size of the third jar of jam
                    jam3_size = scanner.nextDouble(); // Store user input under jam3_size

                    System.out.print("Please enter the expiry date of this jam (xx/xx/20xx): "); // Ask the user for the expiry date of the third jar of jam
                    jam3_expiry = scanner.next(); // Store user input under jam3_expiry

                    Jam jam1 = new Jam(jam1_name, jam1_size, jam1_expiry); // Create Jam object for first Jar of jam
                    Jam jam2 = new Jam(jam2_name, jam2_size, jam2_expiry); // Create Jam object for second Jar of jam
                    Jam jam3 = new Jam(jam3_name, jam3_size, jam3_expiry); // Create Jam object for third Jar of jam

                    Pantry pantry = new Pantry(jam1, jam2, jam3); // Create Pantry object for the pantry the user will use

                    pantries = pantry.Add_Element(pantries, pantry); // Call Add_Element method to create new array
                    current_pantry = pantries[i]; // Set the current pantry to the pantry just created
                    pantry_number = i + 1; // Set the pantry number to i + 1
                    System.out.println("\n"); // Formatting (skips line)

                        while(true)
                        { // Start of menu navigation loop
                            // Menu output
                            System.out.format("%s%d%n%n", "Currently Selected Pantry: ", (pantry_number));
                            System.out.format("%s%n%s%n%s%n%s%n", "Access Other Pantries --> ap", "Select a Jam Jar --> sel", "Spread a Jam Jar --> spr", "Output Current Contents --> print");
                            System.out.format("%s%n%s%n", "Create a new Pantry --> cnp", "Exit --> e");

                            user_choice = scanner.next(); // Store user input under user_choice

                                if(user_choice.equalsIgnoreCase("ap"))
                                { // Start of if block
                                    System.out.println("Which pantry would you like to access?"); // Ask user which pantry they would like to access
                                        for(int count = 1; count <= pantries.length; count++)
                                            System.out.format("%s%d%s%d%n", "Pantry ", count, " --> ", count); // Display all pantries currently created by the user
                                        pantry_number = scanner.nextInt(); // Set the pantry number to the number the user enters
                                        current_pantry = pantries[pantry_number - 1]; // Set the current pantry to the one the user requested
                                } // End of if block

                                else if(user_choice.equalsIgnoreCase("sel"))
                                { // Start of else if block
                                    System.out.print("Which Jar would you like to select(1, 2, 3): "); // Ask user which jar they would like to select
                                    jar_selection = scanner.nextInt(); // Store their selection under jar_selection variable
                                    current_pantry.select(jar_selection); // Call select method, passing in the selection they chose
                                } // End of else if block

                                else if(user_choice.equalsIgnoreCase("spr"))
                                { // Start of else if block
                                    System.out.print("How much would you like to spread(fl oz.): "); // Ask user how much jam they would like to spread
                                    spread_amount = scanner.nextDouble(); // Store the amount under spread_amount variable
                                    current_pantry.spread(spread_amount); // Call the spread method, passing in the spread amount they chose
                                } // End of else if block

                                else if(user_choice.equalsIgnoreCase("print"))
                                    current_pantry.print(); // Call the print method on the current pantry

                                else if(user_choice.equalsIgnoreCase("cnp"))
                                    break; // Break out of the menu navigation loop to go back to the pantry creation loop

                                else if(user_choice.equalsIgnoreCase("e"))
                                    System.exit(1); // Exit the program

                                else
                                    System.out.println("Please enter a valid command.\n"); // Tell the user that their command was invalid
                        } // End of menu navigation loop
                    i++; // Add 1 to i to keep track of the number of pantries created
                } // End of Pantry creation loop
    } // End of main method
} // End of Pantry_Tester class