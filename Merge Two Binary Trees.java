/*You are given two binary trees root1 and root2.

Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

Return the merged tree.

Note: The merging process must start from the root nodes of both trees.
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
         return merge(root1,root2);
    }
    public TreeNode merge(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null){
            return null;
        }
        if(t1==null && t2!=null){
            return t2;
        }
        else if(t1!=null && t2==null){
            return t1;
        }
        TreeNode sum=new TreeNode(t1.val+t2.val);
        sum.left=merge(t1.left,t2.left);
        sum.right=merge(t1.right,t2.right);
        return sum;
    }
}
