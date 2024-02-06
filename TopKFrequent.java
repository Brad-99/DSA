import java.util.*;

// Define a class named topKFrequent
class topKFrequent {

    // Define a method named topKFrequent to find the k most frequent elements in
    // the array
    public int[] topKFrequent(int[] nums, int k) {
        // Map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Count the frequency of each element in the array and store it in frequencyMap
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // MinHeap to keep track of the k most frequent elements
        // We use a PriorityQueue to maintain the k most frequent elements
        // We override the comparator to sort based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        // Add elements to the heap until size becomes k
        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num); // Add the element to the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // If heap size exceeds k, remove the least frequent element
            }
        }

        // Extract elements from heap into an array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll(); // Extract elements from heap starting from the end of the array
        }

        return result; // Return the k most frequent elements
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Create an instance of the topKFrequent class
        topKFrequent solution = new topKFrequent();

        // Example 1
        int[] nums1 = { 1, 1, 1, 2, 2, 3 };
        int k1 = 2;
        int[] result1 = solution.topKFrequent(nums1, k1); // Find the k most frequent elements in nums1
        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("Example 1 Output: " + Arrays.toString(result1)); // Output: [1, 2]

        // Example 2
        int[] nums2 = { 1 };
        int k2 = 1;
        int[] result2 = solution.topKFrequent(nums2, k2); // Find the k most frequent elements in nums2
        System.out.println("nums2: " + Arrays.toString(nums2));
        System.out.println("Example 2 Output: " + Arrays.toString(result2)); // Output: [1]
    }
}
