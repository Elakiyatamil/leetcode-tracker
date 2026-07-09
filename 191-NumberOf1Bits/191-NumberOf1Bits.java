// Last updated: 09/07/2026, 09:52:40
class Solution 
{
    public int hammingWeight(int n) 
    {
        int[] bits = new int[32]; // 32 bits for an integer
        int index = 0;

        // Step 1: Convert to binary and store bits in array
        while (n > 0) 
        {
            bits[index++] = n % 2; // store remainder (0 or 1)
            n = n / 2;
        }

        // Step 2: Count number of 1s
        int count = 0;
        for (int i = 0; i < index; i++) 
        {
            if (bits[i] == 1) count++;
        }

        return count;
    }
}