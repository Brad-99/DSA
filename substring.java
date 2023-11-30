import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class substring {
    // Function to count and print matched substrings between two strings
    static int countSubstrs(String s1, String s2) {
        // Create lists to store substrings of both strings
        List<String> substrings1 = new ArrayList<>();
        List<String> substrings2 = new ArrayList<>();

        // Generate substrings for the first string (s1)
        for (int i = 0; i < s1.length(); i++) {
            String s3 = "";
            char[] s4 = s1.toCharArray();
            for (int j = i; j < s1.length(); j++) {
                s3 += s4[j];
                substrings1.add(s3);
            }
        }

        // Generate substrings for the second string (s2)
        for (int i = 0; i < s2.length(); i++) {
            String s3 = "";
            char[] s4 = s2.toCharArray();
            for (int j = i; j < s2.length(); j++) {
                s3 += s4[j];
                substrings2.add(s3);
            }
        }

        // Print all substrings of both strings
        System.out.println("Substrings of s1:");
        for (String s : substrings1) {
            System.out.print(s + " | ");
        }
        System.out.println();

        System.out.println("Substrings of s2:");
        for (String s : substrings2) {
            System.out.print(s + " | ");
        }
        System.out.println();

        // Compare and print matched substrings
        System.out.println("Matched Substrings:");
        int matchedCount = 0;
        for (String s : substrings1) {
            if (substrings2.contains(s)) {
                System.out.print(s + " | ");
                matchedCount++;
            }
        }
        System.out.println();

        return matchedCount; // Return the count of matched substrings
    }

// -------------------------------------------------------------------------------------------------------------------------------------Driver

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String s1 = input.next();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String s2 = input.next();

        // Call the countSubstrs function to perform substring matching
        int matchedCount = countSubstrs(s1, s2);

        // Print the total count of matched substrings
        System.out.println("Total matched substrings: " + matchedCount);

        input.close(); // Close the scanner when done with input
    }
}