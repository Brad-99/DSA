import java.util.Scanner;

// Class representing a node in the stack
class StackNode {
    int data; // Data part of the node
    StackNode next; // Pointer to the next node

    // Constructor to initialize the node
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Class representing the stack using a linked list
class MyStack {
    StackNode top; // Top element of the stack

    // Method to push a new element onto the stack
    void push(int data) {
        StackNode newNode = new StackNode(data); // Create a new node with given data
        newNode.next = top; // Link the new node with the current top
        top = newNode; // Update the top to be the new node
    }

    // Method to pop the top element from the stack
    int pop() {
        if (top == null) { // Check if the stack is empty
            return -1; // Return -1 to indicate stack is empty
        } else {
            int poppedData = top.data; // Store the data of the top node
            top = top.next; // Update the top to the next node
            return poppedData; // Return the popped data
        }
    }
}

public class StackLinkedList {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack(); // Create a new stack

        System.out.println("Enter number of operations:");
        int operations = scanner.nextInt(); // Read number of operations

        for (int i = 0; i < operations; i++) {
            System.out.println("Enter operation (1 for push, 2 for pop):");
            int operation = scanner.nextInt(); // Read the operation type

            if (operation == 1) {
                System.out.println("Enter a number to push:");
                int number = scanner.nextInt(); // Read the number to push
                stack.push(number); // Push the number onto the stack
            } else if (operation == 2) {
                int result = stack.pop(); // Pop the top element from the stack
                if (result == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped element: " + result);
                }
            } else {
                System.out.println("Invalid operation.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
