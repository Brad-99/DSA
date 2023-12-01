// Represents a node of a linked list
class Node {
    int data; // Data element of the node (stores an integer)
    Node next; // Reference to the next node in the list

    // Constructor to initialize the node with a value
    Node(int val) {
        data = val; // Sets the data of the node
        next = null; // Initially, the next node is set to null
    }
}

class linkedListRecursion {

    // Global variable for counting the frequency of a given element
    static int frequency = 0;

    /* Method to add a new node at the front of the list */
    static Node push(Node head, int new_data) {
        // Create a new node with the given data
        Node new_node = new Node(new_data);

        // Link the new node to the current head of the list
        new_node.next = head;

        // Update the head to be the new node
        head = new_node;

        // Return the updated list head
        return head;
    }

    /* Method to count the occurrences of a specific value in the list */
    static int count(Node head, int key) {
        // Base case: if list is empty, return the frequency
        if (head == null)
            return frequency;

        // If the current node's data matches the key, increment frequency
        if (head.data == key)
            frequency++;

        // Recursively count in the rest of the list
        return count(head.next, key);
    }

    // Main method to run the code
    public static void main(String args[]) {
        // Initialize an empty list
        Node head = null;

        // Construct the list 1->2->1->3->1
        head = push(head, 1);
        head = push(head, 3);
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 1);

        // Count the occurrences of 1 in the list and print the result
        System.out.print("count of 1 is " + count(head, 1));
    }
}

// Code contributed by Rachana Soma
