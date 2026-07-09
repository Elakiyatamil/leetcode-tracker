// Last updated: 09/07/2026, 09:47:04
class Solution 
{
    public String makeGood(String s) 
    {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) 
        {
            // Check if current char and top of stack are same letter but opposite case
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) 
            {
                stack.pop(); // remove the bad pair
            } else 
            {
                stack.push(ch); // keep it
            }
        }

        // Build final string from stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) 
        {
            result.append(c);
        }

        return result.toString();
    }
}