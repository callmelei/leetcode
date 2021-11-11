/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int count = 1;
        ListNode itr = head, tail;
        while (itr.next != null) {
            count++;
            itr = itr.next;
        }
        tail = itr;
        if (k % count == 0)
            return head;
        itr = head;
        // move to the node before the break
        for (int i = 1; i < count - k % count; i++)
            itr = itr.next;
        ListNode newHead = itr.next;
        itr.next = null;
        tail.next = head;
        return newHead;
    }
}
// @lc code=end
