/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by the start
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> results = new ArrayList<>();
        int[] prevInterval = intervals[0];
        results.add(prevInterval);
        for (int[] interval : intervals) {
            if (prevInterval[1] >= interval[0])
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
            else {
                prevInterval = interval;
                results.add(prevInterval);
            }
        }

        return results.toArray(new int[results.size()][]);
    }
}
// @lc code=end
