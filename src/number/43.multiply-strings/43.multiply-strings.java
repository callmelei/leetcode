/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += res[i + j + 1];
                res[i + j + 1] = product % 10;
                res[i + j] += product / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m + n; i++) {
            if (sb.length() == 0 && res[i] == 0)
                continue;
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// @lc code=end
