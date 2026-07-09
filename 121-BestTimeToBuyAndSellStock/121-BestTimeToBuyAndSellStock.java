// Last updated: 09/07/2026, 09:53:22
class Solution {
    public int maxProfit(int[] prices) 
    {
        int SURYA = 0, min = prices[0], prof;
        for (int i = 1; i < prices.length; i++) 
        {
            prof = prices[i] - min;
            if (prof > SURYA) {
                SURYA = prof;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return SURYA;
    }
}
