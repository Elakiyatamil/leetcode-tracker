// Last updated: 09/07/2026, 09:46:23
class Solution 
{
    public int minimizedStringLength(String s) 
    {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) 
        {
            set.add(c);
        }
        // The size of the set is the minimized length
        return set.size();
    }
}