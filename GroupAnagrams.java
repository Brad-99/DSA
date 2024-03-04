import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
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
        // Example 1
        String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> output1 = groupAnagrams(input1);
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + output1);

        // Example 23
        String[] input2 = { "" };
        List<List<String>> output2 = groupAnagrams(input2);
        System.out.println("\nExample 2:");
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + output2);

        // Example 3
        String[] input3 = { "a" };
        List<List<String>> output3 = groupAnagrams(input3);
        System.out.println("\nExample 3:");
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Output: " + output3);

        
    }
}
