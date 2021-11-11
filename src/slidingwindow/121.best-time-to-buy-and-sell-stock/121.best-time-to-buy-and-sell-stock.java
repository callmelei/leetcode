/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, acc = 0;
        for (int i = 1; i < prices.length; i++) {
            acc = Math.max(0, acc + prices[i] - prices[i - 1]);
            res = Math.max(res, acc);
        }
        return res;
    }
}
// @lc code=end
