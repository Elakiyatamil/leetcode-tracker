// Last updated: 09/07/2026, 09:49:03
class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
         // Create a new array to store result
        int[] result = new int[nums.length];
        int index = 0;

        // Step 1: Add all even numbers first
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Step 2: Add all odd numbers next
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}