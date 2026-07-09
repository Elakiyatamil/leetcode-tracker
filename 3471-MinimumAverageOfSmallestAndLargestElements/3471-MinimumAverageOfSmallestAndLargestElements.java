// Last updated: 09/07/2026, 09:46:12
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            int minElement = nums[i];
            int maxElement = nums[n - 1 - i];
            double avg = (minElement + maxElement) / 2.0;
            minAvg = Math.min(minAvg, avg);
        }
        return minAvg;
    }
}