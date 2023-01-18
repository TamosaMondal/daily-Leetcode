/*You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
*/

class Node{
    int first;
    int second;
    int step;

    Node(int first,int second,int step){
        this.first=first;
        this.second=second;
        this.step=step;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Node>q=new LinkedList<Node>();
        int[][]vis=new int[n][m];
        int currentFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Node(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    currentFresh++;
                }
            }
        }
        int step=0;
        int delRow[]={-1,1,0,0};
        int delCol[]={0,0,1,-1};
        int count=0;
        while(!q.isEmpty()){
        int row=q.peek().first;
        int col=q.peek().second;
        int s=q.peek().step;
        step=Math.max(step,s);
        q.remove();
        for(int i=0;i<4;i++){
        int nrow=row+delRow[i];
        int ncol=col+delCol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
            q.add(new Node(nrow,ncol,s+1));
            vis[nrow][ncol]=2;
            count++;
        }
        }
        }
        if(count!=currentFresh){
            return -1;
        }
        return step;
    }
}
