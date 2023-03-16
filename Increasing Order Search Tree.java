/*Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

 
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
    ArrayList<TreeNode> arr=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        inorder(root);
        for(int i=0;i<arr.size()-1;i++){
            arr.get(i).right=arr.get(i+1);
            arr.get(i).left=null;
        }
        arr.get(arr.size()-1).left=null;
        arr.get(arr.size()-1).right=null;
        return arr.get(0);
    }
    void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        arr.add(node);
        inorder(node.right);

    }
}
