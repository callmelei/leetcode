/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1)
            return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            sbs[i] = new StringBuilder();
        int index = 0, direction = -1;
        for (int i = 0; i < s.length(); i++) {
            // switch direction at the first/last row
            if (index == 0 || index == numRows - 1)
                direction = 0 - direction;
            sbs[index].append(s.charAt(i));
            index += direction;
        }
        // get result string
        for (int i = 1; i < numRows; i++)
            sbs[0].append(sbs[i]);
        return sbs[0].toString();
    }
}
// @lc code=end
