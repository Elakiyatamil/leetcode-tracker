// Last updated: 09/07/2026, 09:49:54
class Solution {
    public double findMaxAverage(int[] nums, int k) 
    { 
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;
       for (int i = 0; i < nums.length; i++) 
       {
         sum += nums[i];
         if (i >= k) 
         {
            sum -= nums[i - k];
         }
            if (i >= k - 1) 
            {
                maxAvg = Math.max(maxAvg, (double) sum / k);
            }
        }
    return maxAvg;
    }
}