// Last updated: 09/07/2026, 09:53:16
class Solution 
{
    public int singleNumber(int[] nums) 
    {
        // Create a map to store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences using getOrDefault
        for (int num : nums) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find and return the number that appears only once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() == 1) 
            {
                return entry.getKey();
            }
        }
        
        return -1; // Default return (should not happen as per problem constraints) 
    }
}