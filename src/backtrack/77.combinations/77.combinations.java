/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, n, k, new ArrayList<Integer>(), 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, int n, int k, List<Integer> tempList, int start) {
        if (tempList.size() == k)
            res.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i <= n; i++) {
                tempList.add(i);
                backtrack(res, n, k, tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
// @lc code=end
