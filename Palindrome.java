import java.util.Scanner;

class Palindrome {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        // Check if the string is a palindrome by comparing characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create an instance of the Solution class
        Palindrome solution = new Palindrome();

        // Check if the input string is a palindrome
        boolean result = solution.isPalindrome(input);

        // Display the result
        System.out.println("Output: " + result);
    }
}
