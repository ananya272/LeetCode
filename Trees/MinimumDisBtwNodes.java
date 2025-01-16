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
public class MinimumDisBtwNodes{
    private Integer prev = null;
    private int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // In-order traversal: left -> current -> right
        inOrderTraversal(node.left);

        // Calculate the difference with the previous node
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;

        inOrderTraversal(node.right);
    }

}