import java.util.Scanner; // Importing Scanner class

class Person
{ // Start of Person class
    String name = ""; // String which will store the name of the Person
    Person next = null; // Person variable which will store the next Person in the circle

    Person(String name)
    { // Start of Person constructor
        this.name = name; // Assign the class variable of name equal to the name they enter when creating a Person in main
    } // End of Person constructor

    Person getNext()
    { // Start of getNext method
        return next; // Return the class variable next
    } // End of getNext method

    void setNext(Person person)
    { // Start of setNext method
        this.next = person; // Assign the class variable next equal to the person they pass in
    } // End of setNext method

    public String toString()
    { // Start of toString method
        return this.name; // return the name of the Person back to main
    } // End of toString method
} // End of Person class

class JosephusProblem
{ // Start of JosephusProblem class
    Person head = null; // Variable which will store the head of the circle (linked list)
    Person tail = null; // Variable which will store the tail of the circle (Linked list)
    int counter = 0; // Variable which will store how many people are in the circle

    // Empty constructor
    JosephusProblem() { // Start of JosephusProblem constructor

    } // End of JosephusProblem constructor

    void InsertTail(String name)
    { // Start of InsertTail method
        Person person = new Person(name); // Create a new Person, passing in the name they created
        if (head == null)
        { // Start of if block
            head = person; // Assign the head of the circle equal to the person we just created
            tail = person; // Assign the tail of the circle equal to the person we just created
        } // End of if block
        else
        { // Start of else block
            person.setNext(head); // Set the person's link equal to the head
            tail.next = person; // Set the node to the right of the tail equal to the person
            tail = tail.next; // Assign the tail equal to the node after the tail
        } // End of else block
        counter++; // Increment the counter by 1
    } // End of InsertTail method

    void play(int num)
    { // Start of play method
        Person curr = head; // Variable which will allow us to iterate through the circle
        JosephusProblem deletions = new JosephusProblem(); // List which will keep track of the People we killed

        System.out.println("Original Circle: [" + this + "]\n"); // Output the original circle
            while(counter > 1)
            { // Start of while loop
                for(int i = 0; i < num - 1; i++)
                { // Start of for loop
                    curr = curr.next; // Set the curr variable equal to the next person
                } // End of for loop
                deletions.InsertTail(curr.next.name); // Add the acquired person to the deletions list

                if(curr == tail)
                { // Start of if block
                    head = head.next; // Set the head variable equal to the next person
                    curr.next = head; // Set the variable next to curr equal to the head
                } // End of if block
                else
                { // Start of else block
                        if (curr.next == tail)
                            tail = curr; // Assign the tail equal to the current variable

                    curr.next = curr.next.next; // Set the curr's link equal to the node after the next
                } // End of else block
                counter--; // Decrement 1 from counter
            } // End of while loop
        System.out.println("\nThe survivor is: " + curr); // Output the survivor
        System.out.println("\nThe deletions in order are: " + deletions); // Output the dead people in order
    }

    public String toString()
    { // Start of print method
        String output = ""; // String which will output the linked list
        Person curr = head; // Iterative node which will start at the head and go through the linked list
            while(curr.getNext() != head)
            { // Start of while loop
                output += (curr.name + ", "); // Add the current node's value to the output string
                curr = curr.getNext(); // Move to the next node in the linked list
            } // End of while loop
        output += curr.name; // Add the new current person to the output string
        return output; // Output the linked list to the user
    } // End of print method
} // End of JosephusProblem class

public class JosephusProblem_Tester
{ // Start of JosephusProblem_Tester class
    public static void main(String[] args)
    { // Start of main method
        Scanner scanner = new Scanner(System.in); // Scanner variable which will store user input
        JosephusProblem joe = new JosephusProblem(); // Instantiation of JosephusProblem class
        int num_in_circle = 0; // Variable which will keep track of the number of people in the circle
        int skip_value = 0; // Variable which still store the skip value of the list

            System.out.print("How many people would you like to place in the circle: "); // Ask the user for the number of people in the circle
            num_in_circle = scanner.nextInt(); // Store the user input under the num_in_circle variable

                for(int i = 1; i <= num_in_circle; i++)
                { // Start of for loop
                    System.out.print("What is the name of Person #" + i + ": "); // Ask the user for the name of x person
                    joe.InsertTail(scanner.next()); // Store the person's name by calling the InsertTail method, passing in the name entered by the user
                } // End of for loop

            System.out.print("What will the value of M be: "); // Ask the user for the skip value
            skip_value = scanner.nextInt(); // Store the skip value under the skip_value variable
            System.out.println(); // Formatting line

            joe.play(skip_value); // Call the play method, passing in the skip value as a parameter
    } // End of main method
} // End of JosephusProblem class
