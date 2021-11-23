/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRowZero = false, isFirstColZero = false;
        // Store zero status in the first row and the first col
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        isFirstRowZero = true;
                    if (j == 0)
                        isFirstColZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // Set zeros
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }
        if (isFirstRowZero)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[0][j] = 0;
        if (isFirstColZero)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
    }
}
// @lc code=end
