import java.util.Scanner;

// Definition of ListNode class representing a node in a linked list
class ListNode {
    int val; // Value of the node
    ListNode next; // Reference to the next node in the linked list

    // Constructor to initialize a node with a given value
    ListNode(int val) {
        this.val = val;
    }
}

// Class to reverse a linked list
public class reverseLinkedList {

    // Function to reverse a linked list and return the new head
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // Reference to the previous node
        ListNode current = head; // Reference to the current node

        // Traverse the linked list
        while (current != null) { // While the loop haven't reached the end
            ListNode next = current.next; // Save the reference to the next node
            current.next = prev; // Reverse the link to the previous node
            prev = current; // Move the previous pointer to the current node
            current = next; // Move the current pointer to the next node
        }

        return prev; // The new head of the reversed linked list
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Creating a linked list
        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the linked list nodes:");
        ListNode head = null; // Head of the linked list
        ListNode tail = null; // Tail of the linked list

        // Loop to create the linked list based on user input
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);

            // If the linked list is empty, set the new node as both head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // If the linked list is not empty, append the new node to the end
                tail.next = newNode;
                tail = newNode; // Move the tail pointer to the new node
            }
        }

        // Reversing the linked list
        ListNode reversedList = reverseList(head);

        // Output: Displaying the reversed linked list
        System.out.println("Reversed Linked List:");
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
