// Last updated: 09/07/2026, 09:47:13
class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int m = nums.length;
        int arr[] = new int[m];
        arr[0]=nums[0];
        for(int i=1;i<m;i++)
        {
            arr[i]=nums[i]+arr[i-1];
        }
        return arr;
    }
}