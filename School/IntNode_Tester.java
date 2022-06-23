import java.util.Scanner; // Import Scanner class

class IntNode
{ // Start of IntNode class
    int data = 0; // Class variable which will store the data in each node
    IntNode nextNode = null; // Node which will store the node after a given node

    IntNode(int data)
    { // Start of IntNode constructor
        this.data = data; // Set the data class variable equal to the data passed in
        nextNode = null; // Set the next node of this node to be null
    } // End of IntNode constructor

    void setNext(IntNode nextNode)
    { // Start of setNext method
        this.nextNode = nextNode; // Reassign the next node
    } // End of setNext method

    IntNode getNext()
    { // Start of getNext method
        return nextNode; // return the next node of the current node
    } // End of getNext method
} // End of IntNode class

class LinkedList
{ // Start of LinkedList class
    IntNode head = null; // Class variable which will store the head of the linked list

    LinkedList() { // Empty constructor

    }

    void insertNewFirstNode(int value)
    { // Start of insertNewFirstNode method
        IntNode newHead = new IntNode(value); // Create new node with the value passed in
        newHead.nextNode = this.head; // Set the node after the new head equal to the head
        this.head = newHead; // Set the newhead to our new head in the linked list
    } // End of insertNewFirstNode method

    void insertNewLastNode(int data)
    { // Start of insertNewLastNode method
        IntNode newNode = new IntNode(data); // Create node with the passed in data

        if (head == null)
            this.head = newNode; // Set the head equal to the new node

        else
        { // Start of else block
            // There are already elements in the LinkedList
            IntNode curr = this.head; // Start at the head, loop through
            while (curr != null)
            { // Start of while loop
                if (curr.getNext() == null)
                { // Start of if block
                    curr.setNext(newNode); // Set the node after the current node equal to our new node
                    break; // Break out of while loop
                } // End of if block

                curr = curr.getNext(); // Reassign the current node equal to the next node
            } // End of while loop
        } // End of else block
    } // End of insertNewLastNode method

    void deleteFirst()
    { // Start of deleteFirst method
        head = head.nextNode; // Set the head equal to the node after it
    } // End of deleteFirst method

    void listSearch(int value)
    { // Start of listSearch method
        IntNode curr = this.head; // Create node to start at the head
        int i = 1; // Iterative integer

        while(curr != null)
        { // Start of while loop
            if (curr.data == value)
            { // Start of if block
                System.out.println("\nThis value has been found in Node " + i); // Tell the user that the value has been found in whichever node it was found in
                return; // Break out of method
            } // End of if block
            i++; // Add one to i
            curr = curr.nextNode; // Set curr equal to the next node in the linked list
        } // End of while loop
        System.out.println("This value has not been found in the linked list. \n"); // Tell the user that the value has not been found in the linked list
    } // End of listSearch method

    void insertAfter(int afterNode, int newValue)
    { // Start of insertAfter method
        IntNode newNode = new IntNode(newValue); // Create new node, passing in the new value from the user
        IntNode curr = head; // Create an iterative node, starting at the head

        for(int i = 1; i < afterNode; i++)
            curr = curr.nextNode; // Loop through all elements before the afterNode node

        newNode.nextNode = curr.nextNode; // Assign the node after the new node to the node after the current node
        curr.nextNode = newNode; // Set the node after the current node equal to the new node
    } // End of insertAfter method

    void reverse()
    { // Start of reverse method
        IntNode prev = null; // prev node which will keep track of the node previous to the current one
        IntNode curr = head; // Current node which will help us go through the linked list
        IntNode next = null; // next node which will keep track of the node after the current one
        while(curr != null)
        { // Start of while loop
            next = curr.nextNode; // Set the next node equal to the node after the current
            curr.nextNode = prev; // Set the node after the current node equal to prev
            prev = curr; // Set the previous node equal to the current node
            curr = next; // Set the current node equal to the next
        } // End of while loop
        this.head = prev; // In the end, set the new head of the linked list equal to the prev node
    } // End of reverse method

    void print()
    { // Start of print method
        String output = ""; // String which will output the linked list
        IntNode curr = head; // Iterative node which will start at the head and go through the linked list
        while(curr != null)
        { // Start of while loop
            output += (curr.data + ", "); // Add the current node's value to the output string
            curr = curr.getNext(); // Move to the next node in the linked list
        } // End of while loop
        System.out.println(output); // Output the linked list to the user
    } // End of print method
} // End of LinkedList class

public class IntNode_Tester
{ // Start of IntNode_Tester class
    public static void main(String[] args)
    { // Start of main method
        Scanner scanner = new Scanner(System.in); // Instantiation of Scanner class
        scanner.useDelimiter("\\n"); // Delimiter which will disregard enter as an input for the scanner
        LinkedList ll = new LinkedList(); // Creation of our linked list object
        String input = ""; // String which will keep track of user input
        String choice = ""; // String which will keep track of the user's choice during the menu phase of the prgoram
        int value = 0; // Integer which will store the values the user enters
        int node_number = 0; // Integer which will store the user's choice of node numbers

        while(true)
        { // Start of while loop
            System.out.print("Please enter a value to add to the linkedlist, or type e to finish the creation process: "); // Ask the user for a value to add to the linked list
            input = scanner.nextLine(); // Store their input under the input variable

            if(input.equalsIgnoreCase("e"))
                break; // Break out of current loop
            else
            { // Start of else block
                value = Integer.parseInt(input); // Convert the input to an integer
                ll.insertNewLastNode(value); // Insert their entered value into the linked list
            } // End of else block
        } // End of while loop

        while(true)
        { // Start of while loop

            //Output menu
            System.out.format("%n%s%n%s%n", "Linked List Options", "______________________");
            System.out.format("%s%n%s%n%s", "Insert New Head --> inh", "Insert New Tail --> int", "Delete Current Head --> dch");
            System.out.format("%n%s%n%s%n%s%n%s%n%s%n", "Search For Value --> sfv", "Insert Value After Node --> ivan", "Reverse Linked List --> rll", "Output Linked List --> oll", "Exit --> e");
            choice = scanner.next(); // Store user input under choice variable

            if(choice.equalsIgnoreCase("inh"))
            { // Start of if block
                System.out.print("\nWhat value would you like to store in the new head: "); // Ask user which value they would like to store for their new head
                value = scanner.nextInt(); // Store entered value under the value variable
                ll.insertNewFirstNode(value); // Call the insertNewFirstNode method, passing in the value entered
                System.out.println("\nNew Head Added."); // Tell the user that the new head has been added
            } // End of if block
            else if(choice.equalsIgnoreCase("int"))
            { // Start of else if block
                System.out.print("\nWhat value would you like to store in the new tail: "); // Ask user which value they would like to store for their new tail
                value = scanner.nextInt(); // Store entered value under the value variable
                ll.insertNewLastNode(value); // Call the insertNewLastNode method, passing in the value entered
                System.out.println("\nNew Tail Added."); // Tell the user that the new tail has been added
            } // End of else if block
            else if(choice.equalsIgnoreCase("dch"))
            { // Start of else if block
                ll.deleteFirst(); // Call the deleteFirst method
                System.out.println("\nHead deleted."); // Tell the user that the head has been deleted
            } // End of else if block
            else if(choice.equalsIgnoreCase("sfv"))
            { // Start of else if block
                System.out.print("\nWhich value would you like to search for: "); // Ask the user which value they would like to search for in the linked list
                value = scanner.nextInt(); // Store the entered value under the value variable
                ll.listSearch(value); // Call the listSearch method, passing in the value entered
            } // End of else if block
            else if(choice.equalsIgnoreCase("ivan"))
            { // Start of else if block
                System.out.print("\nWhich node would you like to store this new value after (number): "); // Ask the user which node they would like to store the new value after
                node_number = scanner.nextInt(); // Get and store the node number
                System.out.print("Which value would you like to store here: "); // Ask the user which value they want to store here
                value = scanner.nextInt(); // Store the entered value under the value variable
                ll.insertAfter(node_number, value); // Call the insertAfter method, passing in the node number and value
                System.out.println("\nAdded new node."); // Tell the user that the new node has been added
            } // End of else if block
            else if(choice.equalsIgnoreCase("rll"))
            { // Start of else if block
                ll.reverse(); // Call the reverse method
                System.out.println("\nLinked list reversed."); // Tell the user that the linked list has been reversed
            } // End of else if block
            else if(choice.equalsIgnoreCase("oll"))
                ll.print(); // Call the print method

            else if(choice.equalsIgnoreCase("e"))
                System.exit(1); // Exit the program

            else
                System.out.println("\nPlease enter a valid command."); // Tell the user to enter a valid command
        } // End of while loop
    } // End of main method
} // End of IntNode_Tester class