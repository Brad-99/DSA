import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string containing parentheses:");
        String input = scanner.nextLine();
        boolean isValid = isValidParentheses(input);
        if (isValid) {
            System.out.println("The input string has valid parentheses.");
        } else {
            System.out.println("The input string does not have valid parentheses.");
        }
        scanner.close();
    }
}
