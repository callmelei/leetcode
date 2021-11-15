/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int rev = 0, temp;
        while (x != 0) {
            temp = rev * 10 + x % 10;
            if ((temp - x % 10) / 10 != rev)
                return 0;
            rev = temp;
            x /= 10;
        }
        return rev;
    }
}
// @lc code=end
