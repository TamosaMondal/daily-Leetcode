/*Given a Directed Acyclic Graph (DAG) with V vertices and E edges, Find any Topological Sorting of that Graph.
*/

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {//traverse adjacency matrix
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {//if indegree is 0,add in the queue
                q.add(i);
            }
        }
        int topo[] = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo[i++] = node;
            // node is in your topo sort
            // so please remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
//TC-O(V+E)
