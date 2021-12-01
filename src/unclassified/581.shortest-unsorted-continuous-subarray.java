/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // Start: the leftmost element that has smaller element on its right
        // End: the rightmost element that has greater element on its left
        int start = -1, end = -1, max = nums[0], min = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max)
                end = i;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min)
                start = i;
        }
        if (start == -1 || end == -1)
            return 0;
        return end - start + 1;
    }
}
// @lc code=end
