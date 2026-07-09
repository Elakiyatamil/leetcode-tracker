// Last updated: 09/07/2026, 09:49:27
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if (s.length() != goal.length()) return false;
        String str = s + s;
        return str.contains(goal);
    }
}
