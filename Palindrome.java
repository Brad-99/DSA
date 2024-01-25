import java.util.Scanner; // Importing a tool to help us get input from the user

class Solution {
    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0; // A pointer starting from the left end of the cleaned-up string
        int right = s.length() - 1; // A pointer starting from the right end of the cleaned-up string

        // Check if the string is a palindrome by comparing characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If the characters at the pointers are not the same, it's not a palindrome
            }
            left++; // Move the left pointer towards the center
            right--; // Move the right pointer towards the center
        }

        return true; // If the loop completes without finding a mismatch, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a tool to get input from the user

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Check if the input string is a palindrome
        boolean result = solution.isPalindrome(input);

        // Display the result
        System.out.println("Output: " + result);
        System.out.println("Palindrome");
    }
}
