/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
    class Node {
        int val, min;
        Node next;

        Node() {
        }

        Node(int _val, int _min) {
            val = _val;
            min = _min;
            next = null;
        }
    }

    private Node head;

    public MinStack() {
        head = new Node();
    }

    public void push(int val) {
        if (head.next == null) {
            head.next = new Node(val, val);
        } else {
            Node next = head.next;
            head.next = new Node(val, Math.min(val, next.min));
            head.next.next = next;
        }
    }

    public void pop() {
        head.next = head.next.next;
    }

    public int top() {
        return head.next.val;
    }

    public int getMin() {
        return head.next.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
 * param_4 = obj.getMin();
 */
// @lc code=end
