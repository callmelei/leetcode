/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<Integer>(), target, candidates, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list, int target, int[] candidates, int start) {
        if (target < 0)
            return;
        else if (target == 0)
            res.add(new ArrayList<>(list));
        else {
            for (int i = start; i < candidates.length; i++) {
                // skip duplicates
                if (i > start && candidates[i] == candidates[i - 1])
                    continue;
                list.add(candidates[i]);
                backtrack(res, list, target - candidates[i], candidates, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
// @lc code=end
