import java.util.Arrays;

// Anagram means exact the same charaters but in different orders

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        // Check if lengths are different, if yes, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Use an array to count the frequency of each character
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        // Count the frequency of characters in string s
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        // After this process, the charCount array would look like this: [2, 1, ..., 0]

        // Decrement the count for characters in string t
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;

            // If a character count becomes negative, strings are not anagrams
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }

        // If the code reaches here, both strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "tar";
        System.out.println(isAnagram(s2, t2)); // Output: false

        String s3 = "bbb";
        String t3 = "bba"; // If any char below zero means not anagram
        System.out.println(isAnagram(s3, t3)); // Output: false
    }
}

// The time complexity of this solution is O(n), where n is the length of the
// strings. This is because we iterate through each character in both strings
// once. The space complexity is O(1) since the size of the charCount array is
// constant (26 for lowercase English letters).