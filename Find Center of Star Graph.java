/*There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.
*/
class Solution {
    public int findCenter(int[][] edges) {
        //check this any of the two edges and check the number which is common in between them
        int a = edges[0][0];
        int b = edges[0][1];
        int x = edges[1][0];
        int y = edges[1][1];
        if(a==x) return a;
        if(a==y) return a;
        if(b==x) return x;
        if(b==y) return b;
        return 0;
    }
}
