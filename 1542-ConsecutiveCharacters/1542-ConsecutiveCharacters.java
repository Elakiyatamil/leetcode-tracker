// Last updated: 09/07/2026, 09:47:17
class Solution 
{
    public int maxPower(String s) 
    {
        int max = 1;
        int count = 1;
        for (int i=1;i<s.length();++i) 
        {
            count=(s.charAt(i) == s.charAt(i - 1)) ? count + 1 : 1;
            max=Math.max(max, count);
        }
        return max;
    }
}
