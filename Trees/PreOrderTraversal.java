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
public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
           preorderTraversal(root, list);
           return list;
       }
   
       void preorderTraversal(TreeNode node, List<Integer> list) {
           if (node == null) {
               return;
           }
   
           list.add(node.val); // Visit the root node
           preorderTraversal(node.left, list); // Traverse the left subtree
           preorderTraversal(node.right, list); // Traverse the right subtree   
       }
    }

