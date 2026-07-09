// Last updated: 09/07/2026, 09:47:06
class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) 
        {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}