/*You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:

A land cell if grid[r][c] = 0, or
A water cell containing grid[r][c] fish, if grid[r][c] > 0.
A fisher can start at any water cell (r, c) and can do the following operations any number of times:

Catch all the fish at cell (r, c), or
Move to any adjacent water cell.
Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or 0 if no water cell exists.

An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists.
*/
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int [n][m];
        int delrow[]={0,0,-1,1};
        int delcol[]={1,-1,0,0};
        int ans[]={0};
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]!=0){
                    bfs(i,j,grid,vis,ans,delrow,delcol);
                    max=Math.max(max,ans[0]);
                    ans[0]=0;
                }
            }
        }
        return max;
    }
    public void bfs(int i,int j,int[][] grid,int visit[][],int ans[],int delRow[],int delCol[]){
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        visit[i][j]=1;
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();
            ans[0]+=grid[row][col];
            for(int k=0;k<4;k++){
                int nrow=row+delRow[k];
                int ncol=col+delCol[k];
                
                
                if(nrow<n && nrow>=0 && ncol<m && ncol>=0 && visit[nrow][ncol]==0 && grid[nrow][ncol]!=0){
                    q.add(new Pair(nrow,ncol));
                    visit[nrow][ncol]=1;
                }
            }
        }
    }
}
