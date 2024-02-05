import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagramsInput {
    // This is where the main work happens
    public static List<List<String>> groupAnagrams(String[] strs) {
        // We create a special box (HashMap) to keep our words organized
        // based on how their letters are arranged
        HashMap<String, List<String>> anagramGroups = new HashMap<>();

        // Now, we go through each word in our list
        for (String str : strs) {
            // We take each word, shuffle its letters (alphabetical order), and put it back
            // together
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // We check if we already have a box (group) for words with these letters
            if (anagramGroups.containsKey(sortedString)) {
                // If we do, we add this word to the box (group)
                anagramGroups.get(sortedString).add(str);
            } else {
                // If we don't have a box (group) for these letters, we create a new one
                List<String> group = new ArrayList<>();
                // We put this word in the new box (group)
                group.add(str);
                // We label the box (group) with the shuffled letters
                anagramGroups.put(sortedString, group);
            }
        }

        // After going through all the words, we look inside our boxes (groups) and list
        // them all neatly
        return new ArrayList<>(anagramGroups.values());
    }

    // This is like a demonstration to show how the main function works
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words separated by spaces:");
        String inputString = scanner.nextLine();

        // Split the user input into an array of words
        String[] inputWords = inputString.split("\\s+");

        // Call the groupAnagrams function with user input
        List<List<String>> output = groupAnagrams(inputWords);

        // Display the results
        System.out.println("\nUser Input Demo:");
        System.out.println("Input: " + Arrays.toString(inputWords));
        System.out.println("Output: " + output);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
