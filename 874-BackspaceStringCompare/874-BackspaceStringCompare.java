// Last updated: 09/07/2026, 09:49:15
class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        return build(s).equals(build(t));
    }

    private String build(String str) 
    {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) 
        {
            if (ch != '#') {
                sb.append(ch);
            } 
            else if (sb.length() > 0) 
            {
                sb.deleteCharAt(sb.length() - 1); // backspace
            }
        }
        return sb.toString();
    }
}
