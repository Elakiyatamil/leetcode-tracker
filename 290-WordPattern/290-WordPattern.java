// Last updated: 09/07/2026, 09:51:52
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] parts = s.split("\\s+");
        if (pattern.length() != parts.length) return false; 
        for (int i = 0; i < pattern.length(); i++) 
        {
            char ch = pattern.charAt(i);
            String word = parts[i];
            if (map.containsKey(ch)) 
            {
                if (!map.get(ch).equals(word)) 
                {
                    return false;
                }
            } 
            else 
            {
                if (map.containsValue(word)) 
                {
                    return false; 
                }
                map.put(ch, word);
            }
        }
        return true;
    }
}