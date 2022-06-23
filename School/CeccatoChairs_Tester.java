import java.util.*; // Import all classes under java.util directory

class Player
{ // Start of Player class
    String name = ""; // String which will store the name of the Player
    Player next = null; // Player variable which will store the next Player in the circle

    Player(String name)
    { // Start of Player constructor
        this.name = name; // Assign the class variable of name equal to the name they enter when creating a Player in main
    } // End of Player constructor

    Player getNext()
    { // Start of getNext method
        return next; // Return the class variable next
    } // End of getNext method

    void setNext(Player player)
    { // Start of setNext method
        this.next = player; // Assign the class variable next equal to the Player they pass in
    } // End of setNext method

    public String toString()
    { // Start of toString method
        return this.name; // return the name of the Player back to main
    } // End of toString method
} // End of Player class

class CeccatoChairs {
    Player head = null; // Variable which will store the head of the circle (linked list)
    Player tail = null; // Variable which will store the tail of the circle (Linked list)
    int counter = 0; // Variable which will store how many people are in the circle

    // Empty constructor
    CeccatoChairs() { // Start of JosephusProblem constructor

    } // End of JosephusProblem constructor

    void InsertToEnd(String name)
    { // Start of InsertTail method
        Player player = new Player(name); // Create a new Player, passing in the name they created
        if (head == null)
        { // Start of if block
            head = player; // Assign the head of the circle equal to the Player we just created
            tail = player; // Assign the tail of the circle equal to the Player we just created
        } // End of if block
        else
        { // Start of else block
            player.setNext(head); // Set the Player's link equal to the head
            tail.next = player; // Set the node to the right of the tail equal to the Player
            tail = tail.next; // Assign the tail equal to the node after the tail
        } // End of else block
        counter++; // Increment the counter by 1
    } // End of InsertTail method

    void playMusicalChairs() {
        Player curr = head; // Variable which will allow us to iterate through the circle
        Random rand = new Random(); // Variable which will allow us to use the Random class method
        int random_number = 0; // Integer which will store our generated random number

        System.out.println("Original Contenders: [" + this + "]\n"); // Output the original contenders
            while(counter > 1)
            { // Start of while loop
                random_number = (rand.nextInt(this.counter)) + 1; // Generate a new random number between 1 and the num of players
                System.out.println("The random number is now: " + random_number); // Output the random number
                    for(int i = 0; i < random_number - 1; i++)
                        curr = curr.next; // Set the curr variable equal to the next player

                System.out.println(curr.next + " has been moved to the loser list.\n"); // Inform the user of who lost

                    if(curr == tail)
                    { // Start of if block
                        head = head.next; // Set the head variable equal to the next Player
                        curr.next = head; // Set the variable next to curr equal to the head
                    } // End of if block
                    else
                    { // Start of else block
                            if(curr.next == tail)
                                tail = curr; // Assign the tail equal to the current variable

                        curr.next = curr.next.next; // Set the curr's link equal to the node after the next
                    }
                counter--; // Decrement 1 from counter
            } // End of while loop
        System.out.println("\nThe winner is: " + curr + "!"); // Output the winner to the user
    } // End of playMusicalChairs method

    public String toString()
    { // Start of print method
        String output = ""; // String which will output the linked list
        Player curr = head; // Iterative node which will start at the head and go through the linked list
        while(curr.getNext() != head)
        { // Start of while loop
            output += (curr.name + ", "); // Add the current node's value to the output string
            curr = curr.getNext(); // Move to the next node in the linked list
        } // End of while loop
        output += curr.name; // Add the new current Player to the output string
        return output; // Output the linked list to the user
    } // End of print method
} // End of CeccatoChairs class

public class CeccatoChairs_Tester
{ // Start of CeccatoChairs_Tester class

    public static void main(String[] args)
    { // Start of main method
        int num_players = 0; // Variable which will store the number of people playing
        Scanner scanner = new Scanner(System.in); // Instantiation of Scanner Object
        CeccatoChairs game = new CeccatoChairs(); // Create instance of CeccatoChairs class called game

           System.out.print("How many players will play: "); // Ask the user how many people are playing
           num_players = scanner.nextInt(); // Save user input under num_players variable

               for(int i = 1; i <= num_players; i++)
               { // Start of for loop
                System.out.print("What is the name of Player " + i + ": "); // Ask the user for Player x
                game.InsertToEnd(scanner.next()); // Store the Player's name by calling the InserttoEnd method, passing in the name entered by the user
               } // End of for loop

               System.out.println(); // Formatting line
               game.playMusicalChairs(); // Call the playMusicalChairs method
    } // End of main method
} // End of CeccatoChairs_Tester class
