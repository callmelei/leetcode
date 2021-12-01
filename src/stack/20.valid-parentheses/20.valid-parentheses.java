/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '[')
                st.push(']');
            else if (c == '{')
                st.push('}');
            else {
                if (!st.isEmpty() && st.peek() == c)
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}
// @lc code=end
