/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int res = 0, i = 0, j = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                if (height[i] > leftMax) {
                    leftMax = height[i];
                } else
                    res += leftMax - height[i];
                i++;
            } else {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                } else
                    res += rightMax - height[j];
                j--;
            }
        }
        return res;
    }
}
// @lc code=end
