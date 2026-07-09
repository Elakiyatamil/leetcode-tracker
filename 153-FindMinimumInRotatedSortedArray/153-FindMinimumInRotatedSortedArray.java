// Last updated: 09/07/2026, 09:52:56
class Solution 
{
    public int findMin(int[] nums) 
    {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while (low < high) 
        {
          int mid = (low + high) / 2;
          if (nums[mid] > nums[high]) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid;
            }
        }
        return nums[low];
    }

}
