/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<Integer>(), target, candidates, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list, int target, int[] candidates, int start) {
        if (target == 0)
            res.add(new ArrayList<>(list));
        else if (target < 0)
            return;
        else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                backtrack(res, list, target - candidates[i], candidates, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
// @lc code=end
