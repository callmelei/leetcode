/*
 * @lc app=leetcode id=224 lang=java
 *
 * [224] Basic Calculator
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        int res = 0, sign = 1, num = 0;
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ' ')
                continue;
            else if (c >= '0' && c <= '9')
                num = num * 10 + c - '0';
            else if (c == '+') {
                res += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                res += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            } else {
                res += sign * num;
                num = 0;
                res *= st.pop();
                res += st.pop();
            }
        }
        res += sign * num;
        return res;
    }
}
// @lc code=end
