// Last updated: 09/07/2026, 09:48:25
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    ans.append(c);   // not outermost
                }
                stack.push(c);
            } else { // ')'
                stack.pop();
                if (!stack.isEmpty()) {
                    ans.append(c);   // not outermost
                }
            }
        }

        return ans.toString();
    }
}