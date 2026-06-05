class Solution {
    public int maxProfit(int[] prices) {
        // first buy then sell ..

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            maxProfit = Math.max(prices[i] - min, maxProfit);
        }

        return maxProfit;

    }
}