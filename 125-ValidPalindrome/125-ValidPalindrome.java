// Last updated: 09/07/2026, 09:53:21
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder cleaned = new StringBuilder(); 
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) 
            {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String forward = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        return forward.equals(reversed);
    }
}
