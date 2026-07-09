// Last updated: 09/07/2026, 09:50:50
class Solution {
    public int compress(char[] chars) 
    {
        int write = 0, read = 0;
        while (read < chars.length) 
        {
            char ch = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == ch) 
            {
                read++;
                count++;
            }
            chars[write++] = ch;
            if (count > 1) 
            {
                for (char c : String.valueOf(count).toCharArray()) 
                {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
