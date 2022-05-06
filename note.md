# Contents
- [Binary Tree](#binary-tree)
- [List](#list)

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

- Recursion
```java
public void inOrderTraverse(TreeNode root, List<TreeNode> list) {
    if(root == null)
        return;
    inOrderTraverse(root.left, list);
    list.add(root);
    inOrderTraverse(root.right, list);
}

# List

## Quick conversion

- List to 1D array
```java
list.stream().mapToInt(i -> i).toArray();
```
- List of int[] to 2D array
```java
list.toArray(new int[list.size()]);
```

