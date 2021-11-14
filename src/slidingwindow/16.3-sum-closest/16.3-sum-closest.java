/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1, sum;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target)
                    return sum;
                else if (sum > target)
                    k--;
                else
                    j++;
                if (Math.abs(target - res) > Math.abs(target - sum))
                    res = sum;
            }
        }
        return res;
    }
}
// @lc code=end
