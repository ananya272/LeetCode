class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}
public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }

        if(root == p || root == q) {
            return root;
        }

        TreeNode leftFound = lowestCommonAncestor(root.left, p, q);
        TreeNode rightFound = lowestCommonAncestor(root.right, p, q);

        if(leftFound == null) {
            return rightFound;
        } else if(rightFound == null) {
            return leftFound;
        } else {
            return root;
        }
}
}
