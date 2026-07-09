// Last updated: 09/07/2026, 09:47:28
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        
        int i = s.length() - 1;
        
        while (i >= 0) 
        {
            if (s.charAt(i) == '#') 
            {
                // Take two digits before '#'
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                char ch = (char) ('a' + num - 1);
                result.append(ch);
                i -= 3;
            } 
            else 
            {
                int num = s.charAt(i) - '0';
                char ch = (char) ('a' + num - 1);
                result.append(ch);
                i--;
            }
        }
        
        return result.reverse().toString();
    }
}