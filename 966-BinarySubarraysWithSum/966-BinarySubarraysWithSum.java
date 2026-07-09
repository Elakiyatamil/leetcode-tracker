// Last updated: 09/07/2026, 09:48:56


class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1); // base case: empty prefix
        int prefixSum = 0, result = 0;

        for (int num : nums) {
            prefixSum += num;
            // Check if there exists a prefix that makes sum = goal
            result += count.getOrDefault(prefixSum - goal, 0);
            // Record current prefix sum
            count.put(prefixSum, count.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}
