/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> tempList, int start) {
        res.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(nums, res, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
// @lc code=end
