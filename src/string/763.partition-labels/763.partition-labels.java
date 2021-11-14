/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] cache = new int[26];
        // store the max index for each character
        for (int i = 0; i < s.length(); i++)
            cache[s.charAt(i) - 'a'] = i;
        for (int i = 0, j = 0, end = 0; i < s.length(); i++) {
            end = Math.max(end, cache[s.charAt(i) - 'a']);
            if (i == end) { // partition here
                res.add(i - j + 1);
                j = i + 1;
            }
        }
        return res;
    }
}
// @lc code=end
