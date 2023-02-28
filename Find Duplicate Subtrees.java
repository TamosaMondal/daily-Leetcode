/*Given the root of a binary tree, return all duplicate subtrees.

For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with the same node values.
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
    HashMap<String,Integer>map;
    List<TreeNode> res;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map=new HashMap<>();
        res=new ArrayList<>();
        traverse(root);
        return res;
    }
    public String traverse(TreeNode node) {
        if(node==null){
            return "$";
        }
        String subPath=node.val+","+traverse(node.left)+","+traverse(node.right);
        map.put(subPath,map.getOrDefault(subPath,0)+1);
        if(map.get(subPath)==2){
            res.add(node);
        }
        return subPath;
    }
}
