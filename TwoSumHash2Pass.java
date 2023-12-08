import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class TwoSumHash2Pass {

    // This method finds all pairs of numbers that add up to the target
    public static List<int[]> twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                pairs.add(new int[] {i, map.get(complement)});
                // Remove the matched element to avoid duplicate pairs
                map.remove(nums[i]);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        List<int[]> results = twoSum(nums, target);

        if (!results.isEmpty()) {
            System.out.println("All pairs of indices:");
            for (int[] pair : results) {
                System.out.println(pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("No pairs add up to the target.");
        }
    }
}
