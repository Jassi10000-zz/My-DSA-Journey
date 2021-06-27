// remove a node
public static TreeNode remove(TreeNode root, int data) {

    if (root == null) {
        return null;
    }

    if (root.val < data) {
        root.right = remove(root.right, data);
    } else if (root.val > data) {
        root.left = remove(root.left, data);
    } else {
        // handles the 3 cases
        // 1. if root.left == null
        // 2. if root.right == null
        // 3. if root.left and root.right both are null
        if (root.left == null || root.right == null) {
            return root.left != null ? root.left : root.right;
        }

        // if we have to remove the root only
        // then we can replace it with max from left portion or min from right portion
        int maxData = getMax(root.left);

        // now the root will be the maxData from the left
        root.val = maxData;

        // after making maxData the root , duplicacy will be present so delete that node
        // as we took max from left so will work only on left portion
        root.left = remove(root.left, maxData);

        return root;

    }
}

public static int getMax(TreeNode root) {
    while (root.right != null) {
        root = root.right;
    }

    return root.val;
}