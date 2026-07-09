// Last updated: 09/07/2026, 09:52:01
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                
                    int temp = nums[i];
                    nums[i] = nums[lastNonZeroIndex];
                    nums[lastNonZeroIndex] = temp;
                
                lastNonZeroIndex++;
            }
        }
    }
}
