import javax.lang.model.util.ElementScanner14;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums)
            pq.offer(num);
        while (k-- > 1)
            pq.poll();
        return pq.poll();
    }
}
// @lc code=end
