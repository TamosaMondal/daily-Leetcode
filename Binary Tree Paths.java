/*Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.
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
    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        List l=new ArrayList<>();
        return solve(root,l,s);
    }
    public List<String> solve(TreeNode root,List l, String s){
        if(root==null) return l;
        if(root.left==null && root.right==null){    //if it is a leaf node
            l.add(s+root.val);
            return l;
        }
        s= s+root.val+"->";
        solve(root.left, l, s);
        solve(root.right, l, s);
        return l;    
    }
}
