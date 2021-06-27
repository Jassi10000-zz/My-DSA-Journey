public class avlBasic {

    public static class TreeNode {
        int val = 0;
        TreeNode left = 0;
        TreeNode right = 0;

        // bal is the balance factor
        int bal = 0;
        int height = 0;

        TreeNode(int val) {
            this.val = val;
            this.height = 0;
            this.bal = 0;
        }
    }

    public static void updateHeightBalance(TreeNode node) {
        int leftHeight = node.left != null ? node.left.height : -1;
        int rightHeight = node.right != null ? node.right.height : -1;

        node.height = Math.max(leftHeight, rightHeight) + 1;

        node.bal = leftHeight - rightHeight;

    }

    public static TreeNode rightRotation(TreeNode A) {
        TreeNode B = A.left;

        // storing the right subtree of B
        TreeNode rightOfB = B.right;

        B.right = A;
        A.left = rightOfB;

        // updating height and balance of A and B , coz height and balance of C will
        // not be affected in any case
        // we are updating height nd balance of A first coz , now A is child of B
        // nd a root always depends on its child for height
        updateHeightBalance(A);
        updateHeightBalance(B);

        return B;
    }

    public static TreeNode leftRotation(TreeNode A) {
        TreeNode B = A.right;

        // storing the left subtree of B
        TreeNode leftOfB = B.left;

        B.left = A;
        A.right = leftOfB;

        updateHeightBalance(A);
        updateHeightBalance(B);

        return B;
    }

    public static TreeNode getRotation(TreeNode root) {
        // this func will help to balance height and balance
        updateHeightBalance(root);

        // for every structure imagine that they all have subtree, eg
        // ll structure also has a right subtree

        if (root.bal == 2) {
            // ll and lr structure
            if (root.left.bal == 1) {
                // ll structure

                return rightRotation(root);

            } else {
                // lr structure

                root.left = leftRotation(root.left);

                return rightRotation(root);
            }

        } else if (root.bal == -2) {
            // rr and rl structure
            if (root.right.bal == -1) {
                // rr structure

                return leftRotation(root);

            } else {
                // rl structure

                root.right = rightRotation(root);

                return leftRotation(root);
            }
        }

        return root;
    }

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

    root = getRotation(root)
    return root;
}

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

            root = getRotation(root);
            return root;

        }
    }

    public static int getMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }

    public static void display(TreeNode node) {

        if (node == null)
            return null;

        // Reason to take stringBuilder --> its easy to add in stringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" --> " + node.val + " <--");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; i++) {
            root = add(root, i * 10);
        }
        display(root);
    }

}