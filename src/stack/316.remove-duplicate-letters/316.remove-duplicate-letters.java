/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            count[index]--;
            if (visited[index])
                continue;
            else {
                while (!st.isEmpty() && st.peek() > c && count[st.peek() - 'a'] > 0) {
                    visited[st.pop() - 'a'] = false;
                }
                st.push(c);
                visited[index] = true;
            }
        }
        while (!st.isEmpty())
            sb.insert(0, st.pop());
        return sb.toString();
    }
}
// @lc code=end
