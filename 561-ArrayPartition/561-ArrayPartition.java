// Last updated: 09/07/2026, 09:50:09
class Solution 
{
    public int arrayPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int min=0;
        for(int i=0;i<nums.length;i+=2)//(add the smaller of each pair,since we sorted the smaller is on the indices=0,2,4,6...)
        {
            min+=nums[i];
        }
        return min;
    }
}