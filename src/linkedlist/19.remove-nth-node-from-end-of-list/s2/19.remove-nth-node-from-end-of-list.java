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
        // advanced approach: one pass

        // add a node before head in case of removing head
        ListNode start = new ListNode();
        ListNode slow = start, fast = start;
        slow.next = head;

        // move fast n+1 nodes ahead
        for (int i = 1; i <= n + 1; i++)
            fast = fast.next;

        // move slow to the node before the target node
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // remove the target node
        slow.next = slow.next.next;

        return start.next;
    }
}
// @lc code=end
