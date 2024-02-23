import java.util.HashSet;
import java.util.Scanner;

class containsDuplicate {
    public boolean checkForDuplicates(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();

        for (int n : nums) {
            if (hashset.contains(n)) {
                return true;
            }
            hashset.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array of integers separated by spaces: ");
        String[] numsInput = scanner.nextLine().split(" ");

        int[] nums = new int[numsInput.length];
        for (int i = 0; i < numsInput.length; i++) {
            nums[i] = Integer.parseInt(numsInput[i]);
        }

        containsDuplicate solution = new containsDuplicate();
        boolean result = solution.checkForDuplicates(nums);

        if (result) {
            System.out.println("True - There are duplicate elements in the array.");
        } else {
            System.out.println("False - All elements in the array are distinct.");
        }
    }
}