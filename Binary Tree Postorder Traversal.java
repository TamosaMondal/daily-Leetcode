/*Given the root of a binary tree, return the postorder traversal of its nodes' values.*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>a=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return a;
    }
    
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        a.add(root.val);
        
    }
}
