/*Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
*/

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
        int res=Integer.MAX_VALUE;
        TreeNode prev=null;
        public void inorder(TreeNode root){
            if (root == null)
            return;
            inorder(root.left);
            if(prev!=null){
                res=Math.min(res,root.val-prev.val);
            }
            prev=root;
            inorder(root.right);
        }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return res;
        
    }
}
