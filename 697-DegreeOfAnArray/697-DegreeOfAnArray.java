// Last updated: 09/07/2026, 09:49:43
class Solution {
    public int findShortestSubArray(int[] nums) {
       Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int degree = 0;
        int minLength = nums.length;
        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            int freq = count.get(nums[i]);
            if (freq > degree) {
                degree = freq;
                minLength = i - first.get(nums[i]) + 1;
            } else if (freq == degree) {
                minLength = Math.min(
                    minLength,
                    i - first.get(nums[i]) + 1
                );
            }
        }
        return minLength;  
    }
}