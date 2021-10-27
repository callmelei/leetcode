/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> tempList, int start) {
        res.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if (i > start && nums[i] == nums[i - 1])
                continue;
            tempList.add(nums[i]);
            backtrack(nums, res, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
// @lc code=end
