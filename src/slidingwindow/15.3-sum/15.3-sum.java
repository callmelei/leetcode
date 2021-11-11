/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] == sum) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1])
                        lo++;
                    while (lo < hi && nums[hi] == nums[hi + 1])
                        hi--;
                } else if (nums[lo] + nums[hi] < sum) {
                    lo++;
                    while (lo < hi && nums[lo] == nums[lo - 1])
                        lo++;
                } else {
                    hi--;
                    while (lo < hi && nums[hi] == nums[hi + 1])
                        hi--;
                }
            }
        }
        return res;
    }
}
// @lc code=end
