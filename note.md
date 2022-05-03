# Contents
- [Binary Tree](#binary-tree)

# Binary Tree

## In-order traversal

- Iteration
```java
public void inOrderTraverse(TreeNode root) {
    Stack<TreeNode> stack = new Stack();
    TreeNode itr = root;
    while(!stack.isEmpty() || itr != null) {
        while(itr != null) {
            stack.push(itr);
            itr = itr.left;
        }
        itr = stack.pop();
        itr = itr.right;
    }
}
```
