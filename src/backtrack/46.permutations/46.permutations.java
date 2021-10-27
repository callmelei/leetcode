/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // backtrack(res, new ArrayList<Integer>(), nums);
        backtrack(res, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return res;
    }

    // check if the number is used each time
    /*
     * private void backtrack(List<List<Integer>> res, List<Integer> list, int[]
     * nums) { if (list.size() == nums.length) res.add(new ArrayList<>(list)); else
     * { for (int i = 0; i < nums.length; i++) { if (list.contains(nums[i]))
     * continue; list.add(nums[i]); backtrack(res, list, nums);
     * list.remove(list.size() - 1); } } }
     */

    // store the used status in an array
    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length)
            res.add(new ArrayList<>(list));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i])
                    continue;
                list.add(nums[i]);
                used[i] = true;
                backtrack(res, list, nums, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
// @lc code=end
