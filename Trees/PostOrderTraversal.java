import java.util.ArrayList;
import java.util.List;
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

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }
    
    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfs(node.left, result);       // Traverse left subtree
        dfs(node.right, result);      // Traverse right subtree
        result.add(node.val);         // Visit root
    }
}
