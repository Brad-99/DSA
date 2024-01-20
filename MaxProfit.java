public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very large value
        int maxProfit = 0; // Initialize maxProfit to 0

        for (int price : prices) {
            // Update minPrice to the current price if it is lower
            minPrice = Math.min(minPrice, price);

            // Update maxProfit if selling at the current price gives a higher profit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println(solution.maxProfit(prices1)); // Output: 5

        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println(solution.maxProfit(prices2)); // Output: 0
    }
}
