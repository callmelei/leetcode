/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
    Stack<Integer> container;
    Stack<Integer> helper;

    public MyQueue() {
        container = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        while (container.size() > 0)
            helper.push(container.pop());
        container.push(x);
        while (helper.size() > 0)
            container.push(helper.pop());
    }

    public int pop() {
        return container.pop();
    }

    public int peek() {
        return container.peek();
    }

    public boolean empty() {
        return container.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */
// @lc code=end
