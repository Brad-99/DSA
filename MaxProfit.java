import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the stock prices for each day:");

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxProfit(prices);

        System.out.println("The maximum profit is: " + result);

        scanner.close();
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int potentialProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}
