// Last updated: 09/07/2026, 09:48:26
class Solution {
    public List<String> commonChars(String[] words) 
    {
        int minfrequency[] = new int[26];
        for (int i = 0; i < 26; i++) 
        {
            minfrequency[i] = Integer.MAX_VALUE;
        }
        for (String word : words) 
        {
            int charfrequency[] = new int[26];
            for (char ch : word.toCharArray()) 
            {
                charfrequency[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) 
            {
                minfrequency[i] = Math.min(minfrequency[i], charfrequency[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) 
        {
            for (int j = 0; j < minfrequency[i]; j++) 
            {
                result.add(String.valueOf((char) ('a' + i))); // Convert index back to char
            }
        }

        return result;
    }
}
