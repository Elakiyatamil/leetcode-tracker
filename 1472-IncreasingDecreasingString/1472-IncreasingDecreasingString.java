// Last updated: 09/07/2026, 09:47:24
class Solution {
    public String sortString(String s) 
    {
        int[] freq = new int[26]; // frequency array for characters a-z
        
        // Count frequency of each character
        for (char c : s.toCharArray()) 
        {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        int remaining = s.length();
        
        while (remaining > 0) 
        {
            // Step 1: Traverse increasing order (a → z)
            for (int i = 0; i < 26; i++) 
            {
                if (freq[i] > 0) 
                {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }
            
            // Step 2: Traverse decreasing order (z → a)
            for (int i = 25; i >= 0; i--) 
            {
                if (freq[i] > 0) 
                {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                    remaining--;
                }
            }
        }
        
        return result.toString();
    }
}
