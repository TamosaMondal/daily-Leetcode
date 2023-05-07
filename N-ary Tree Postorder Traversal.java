/*Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null) return ans;
        for(Node n: root.children){
            postorder(n);
        }
        ans.add(root.val);
        return ans;
    }
}
