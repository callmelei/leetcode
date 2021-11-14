/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Use HashMap to stroe the index to the right of the same
        // character visited earlier
        // int res = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0, j = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (map.containsKey(c)) {
        // j = Math.max(j, map.get(c));
        // }
        // res = Math.max(res, i - j + 1);
        // map.put(c, i + 1);
        // }
        // return res;

        // Use int[] to store index of visited characters
        int res = 0;
        int[] cache = new int[128];
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (cache[s.charAt(i)] > 0) {
                j = Math.max(j, cache[s.charAt(i)]);
            }
            res = Math.max(res, i - j + 1);
            cache[s.charAt(i)] = i + 1;
        }
        return res;
    }
}
// @lc code=end
