//Iterative In-order Traversal
//Binary tree in-order traversal
public List<Integer> inorderTraversal(TreeNode root){
    List<Integer> list = new ArrayList<>();
    if(root == null) return list;
    Stack<TreeNode> stack = new Stack<>();
    while(root != null || !stack.empty()){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        root = stack.pop();
        list.add(root.val);
        root = root.right;
    }
    return list;
}

//Kth smallest element in a BST
public int kthSmallest(TreeNode root, int k){
    Stack<TreeNode> stack= new Stack<>();
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            stack.push(root);    
            root = root.left;   
        } 
        root = stack.pop();
        if(--k == 0) break;
        root = root.right;
    }
    return root.val;
 }

//Validate BST
public boolean isValidBST(TreeNode root){
    if(root == null) return true;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode pre = null;
    while(root != null || !stack.isEmpty()) {
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    root = stack.pop();
    if(pre != null && root.val <= pre.val) return false;
    pre = root;
    root = root.right;
    }
    return true;
}
