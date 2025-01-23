public class InvertBST {
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
         return null;
        }
        TreeNode leftS = invertTree(root.left);
        TreeNode rightS = invertTree(root.right);
        root.left = rightS;
        root.right = leftS;
        return root;
     }
}
