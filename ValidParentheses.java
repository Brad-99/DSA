
// Import necessary Java libraries
import java.util.Scanner;
import java.util.Stack;

// Define a class named ValidParentheses
public class ValidParentheses {

    // Main method where the execution of the program starts
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string containing parentheses
        System.out.println("Enter a string containing parentheses:");
        // Read the user input
        String input = scanner.nextLine();

        // Call the isValidParentheses method to check if the input string has valid
        // parentheses
        boolean isValid = isValidParentheses(input);

        // Display the result based on whether the input string has valid parentheses or
        // not
        if (isValid) {
            System.out.println("The input string has valid parentheses.");
        } else {
            System.out.println("The input string does not have valid parentheses.");
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }

    // Method to check if a string has valid parentheses
    public static boolean isValidParentheses(String s) {
        // Create a stack to store opening parentheses as they are encountered
        Stack<Character> stack = new Stack<Character>();

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push the corresponding closing
            // parenthesis onto the stack
            if (c == '(')
                stack.push(')');
            // If the character is an opening brace, push the corresponding closing brace
            // onto the stack
            else if (c == '{')
                stack.push('}');
            // If the character is an opening bracket, push the corresponding closing
            // bracket onto the stack
            else if (c == '[')
                stack.push(']');
            // If the character is a closing parenthesis
            else if (stack.isEmpty() || stack.pop() != c)
                // Check if the stack is empty (no matching opening parenthesis) or the top of
                // the stack
                // does not match the closing parenthesis. If either condition is true, return
                // false.
                return false;
        }

        // After processing all characters, check if the stack is empty. If it is, the
        // parentheses are balanced.
        // Otherwise, there are unmatched opening parentheses, so return false.
        return stack.isEmpty();
    }
}
