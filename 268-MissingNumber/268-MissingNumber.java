// Last updated: 09/07/2026, 09:52:13
import java.util.Arrays;

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        Arrays.sort(nums);  
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != i) {
                return i;
            }
        }   
        return nums.length; // if none missing inside, last one is missing
    }
}
