/*Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

 
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
    int numberOfPaths=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        calculatePathSum(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return numberOfPaths;
    }
    public void  calculatePathSum(TreeNode root, int targetSum,long curSum){
        if(root==null) return;
        curSum=curSum+root.val;
        if(targetSum==curSum){
            numberOfPaths++;
        }
        calculatePathSum(root.left,targetSum,curSum);
        calculatePathSum(root.right,targetSum,curSum);

    }
}
