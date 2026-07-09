// Last updated: 09/07/2026, 09:52:19
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
       int n = nums.length;
       int result [] = new int[n];
       int prev=1;
       int post=1;
       for(int i=0;i<n;i++)
       {
        result[i]=1;
       }
       for(int i=0;i<n;i++)
       {
        result[i]=prev * result[i];
        prev = nums[i] * prev;
       }
        for(int i=n-1;i>=0;i--)
       {
        result[i]=post * result[i];
        post = nums[i] * post;
       }
       return result;
    }
}