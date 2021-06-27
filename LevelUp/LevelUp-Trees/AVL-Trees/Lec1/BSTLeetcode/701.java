// add a node
public static TreeNode add(TreeNode root, int val) {

    if (root == null) {
        return new TreeNode(val);
    }

    if (root.val < val) {
        root.right = add(root.right, val);
    } else {
        root.left = add(root.left, val);
    }

    return root;
}