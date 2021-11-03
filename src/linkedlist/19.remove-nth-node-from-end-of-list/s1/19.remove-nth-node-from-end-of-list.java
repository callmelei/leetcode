/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // naive appraoch: 2 passes
        int count = 0;
        ListNode itr = head;
        while (itr != null) {
            count++;
            itr = itr.next;
        }
        if (count == n)
            return head.next;
        itr = head;
        // get to the node before the target
        for (int i = 1; i < count - n; i++) {
            itr = itr.next;
        }
        itr.next = itr.next.next;
        return head;
    }
}
// @lc code=end
