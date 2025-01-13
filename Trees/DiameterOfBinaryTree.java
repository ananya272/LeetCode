public class DiameterOfBinaryTree {
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
        
    static class Info {
        int ht;
        int diam;

        public Info(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam - 1; // Subtract 1 because diameter is counted as the number of edges, not nodes.
    }

    private Info diameter(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        // Calculate diameter through the current root
        int diamRoot = left.ht + right.ht + 1;

        // Height of the current node
        int ht = Math.max(left.ht, right.ht) + 1;

        // Maximum diameter
        int diam = Math.max(diamRoot, Math.max(left.diam, right.diam));

        return new Info(ht, diam);
    }
}
