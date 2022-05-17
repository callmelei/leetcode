# Contents
- [Binary Tree](#binary-tree)
- [DFS](#dfs)
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

# DFS

## Graph: sum of path
```java
public int dfs(int src, int des, Map<Integer, Map<Integer, Integer>> graph, HashSet<Integer> visited, int sum) {
    if(src == des)
        return sum;
    visited.add(src);
    int tmp = -1;
    for(int next : graph.get(src).keySet()) {
        if(!visited.contains(next)) {
            tmp = dfs(next, des, graph, visited, sum + graph.get(src).get(next));
            if(tmp != -1) break;
        }
    }
    return tmp;
}
```

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

