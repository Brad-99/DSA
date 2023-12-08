import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// Class declaration
public class TwoSumHash2Pass {

    // Method to find all pairs of indices whose values add up to the target
    public static List<int[]> twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // HashMap to store number and its index
        List<int[]> pairs = new ArrayList<>(); // List to store pairs of indices

        // First loop: store each number and its index in the map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Second loop: find pairs that add up to the target.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement of the current number
            // Check if the complement exists in the map and is not the current number
            // itself
            if (map.containsKey(complement) && map.get(complement) != i) {
                pairs.add(new int[] { i, map.get(complement) }); // Add the pair of indices to the list
                map.remove(nums[i]); // Remove the current number to avoid duplicate pairs
            }
        }

        return pairs; // Return the list of pairs
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for reading input

        // Prompt user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt(); // Read the number of elements

        int[] nums = new int[n]; // Create an array to store the numbers

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt(); // Read each number into the array
        }

        // Prompt user to enter the target sum
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt(); // Read the target sum

        // Call the twoSum method and store the result in 'results'
        List<int[]> results = twoSum(nums, target);

        // Check if the result list is not empty and display the pairs
        if (!results.isEmpty()) {
            System.out.println("All pairs of indices:");
            for (int[] pair : results) {
                System.out.println(pair[0] + ", " + pair[1]); // Print each pair of indices
            }
        } else {
            // If no pairs found, display a message
            System.out.println("No pairs add up to the target.");
        }
    }
}
