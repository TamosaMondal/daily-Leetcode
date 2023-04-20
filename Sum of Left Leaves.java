/*Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

 
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
    int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }
        //For Leaf Node
        if (root.left!=null&& root.left.left==null && root.left.right==null){
            ans+=root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return ans;
    }
}
