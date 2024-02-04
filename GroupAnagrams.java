import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store groups of anagrams
        HashMap<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a char array, sort it, and then convert it back to a
            // string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // Check if the sorted string is already a key in the HashMap
            if (anagramGroups.containsKey(sortedString)) {
                // If yes, add the original string to the existing group
                anagramGroups.get(sortedString).add(str);
            } else {
                // If no, create a new group with the sorted string as the key
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramGroups.put(sortedString, group);
            }
        }

        // Convert the values of the HashMap to a List and return the result
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        // Example 1
        String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> output1 = groupAnagrams(input1);
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + output1);

        // Example 2
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
