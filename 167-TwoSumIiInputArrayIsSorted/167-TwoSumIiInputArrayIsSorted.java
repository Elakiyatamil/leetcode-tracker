// Last updated: 09/07/2026, 09:52:54
class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int left = 0;                  // start pointer
        int right = numbers.length - 1; // end pointer 
        while (left < right) 
        {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) 
            {
                // return 1-based indices as per problem statement
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;   // move left pointer forward to increase sum
            } else {
                right--;  // move right pointer backward to decrease sum
            }
        }    
        // problem guarantees exactly one solution, but we still return null if not found
        return null;
    }
}