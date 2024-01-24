class Solution {
    public int maxProfit(int[] prices) {
        // Check if the array is empty or has only one element
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize variables to track minimum price and maximum profit
        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate through the array starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is found
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate the potential profit if selling on the current day
            int potentialProfit = prices[i] - minPrice;

            // Update the maximum profit if a better selling opportunity is found
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}
