/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        int res = 0, i = 0, sign = 1;
        // skip whitespaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        // get sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        while (i < s.length()) {
            int digit = s.charAt(i++) - '0';
            if (digit < 0 || digit > 9)
                break;
            // overflow check
            if (res > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + digit;
        }
        return res * sign;
    }
}
// @lc code=end
