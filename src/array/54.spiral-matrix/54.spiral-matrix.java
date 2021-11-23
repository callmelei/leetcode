/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int rowTop = 0, rowBottom = m - 1, colLeft = 0, colRight = n - 1;
        while (rowTop <= rowBottom && colLeft <= colRight) {
            for (int j = colLeft; j <= colRight; j++)
                res.add(matrix[rowTop][j]);
            rowTop++;
            for (int i = rowTop; i <= rowBottom; i++)
                res.add(matrix[i][colRight]);
            colRight--;
            if (rowTop <= rowBottom) {
                for (int j = colRight; j >= colLeft; j--)
                    res.add(matrix[rowBottom][j]);
            }
            rowBottom--;
            if (colLeft <= colRight) {
                for (int i = rowBottom; i >= rowTop; i--)
                    res.add(matrix[i][colLeft]);
            }
            colLeft++;
        }
        return res;
    }
}
// @lc code=end
