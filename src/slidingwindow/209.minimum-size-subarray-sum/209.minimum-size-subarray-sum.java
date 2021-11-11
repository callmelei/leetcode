/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE, i = 0, j = 0, sum = 0;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
                res = Math.min(res, j - i);
                sum -= nums[i++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
// @lc code=end
