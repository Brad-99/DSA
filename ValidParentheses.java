import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

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

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
