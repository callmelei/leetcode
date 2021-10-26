/*
 * @lc app=leetcode id=315 lang=java
 *
 * [315] Count of Smaller Numbers After Self
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int[] res = new int[nums.length];
        int[] indices = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            indices[i] = i;
        mergeSort(nums, indices, 0, nums.length - 1, res);
        List<Integer> list = new ArrayList<>();
        for (int i : res)
            list.add(i);
        return list;
    }

    private void merge(int[] nums, int[] indices, int l, int m, int r, int[] res) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        int countInversion = 0;
        while (i <= m && j <= r) {
            if (nums[indices[i]] > nums[indices[j]]) {
                countInversion++;
                temp[k++] = indices[j++];
            } else {
                res[indices[i]] += countInversion;
                temp[k++] = indices[i++];
            }
        }

        while (i <= m) {
            res[indices[i]] += countInversion;
            temp[k++] = indices[i++];
        }
        while (j <= r)
            temp[k++] = indices[j++];

        for (int p = 0; p <= r - l; p++)
            indices[l + p] = temp[p];
    }

    private void mergeSort(int[] nums, int[] indices, int l, int r, int[] res) {
        if (l >= r)
            return;
        int m = (r - l) / 2 + l;
        mergeSort(nums, indices, l, m, res);
        mergeSort(nums, indices, m + 1, r, res);
        merge(nums, indices, l, m, r, res);
    }
}
// @lc code=end
