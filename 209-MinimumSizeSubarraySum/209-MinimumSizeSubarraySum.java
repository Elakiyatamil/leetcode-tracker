// Last updated: 09/07/2026, 09:52:32
class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
       int min = Integer.MAX_VALUE;
       int start = 0, end = 0, tempsum = 0;
       for(end = 0; end<nums.length;end++)
       {
         tempsum+=nums[end];
            while(tempsum >= target)
            {
               min = Math.min(min, end - start + 1);
               tempsum -= nums[start];
               start++;
            } 
       } 
       return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}