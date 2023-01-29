/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/
class Pair{
    int first;
    int second;
    Pair(int fst,int scnd){
        this.first=fst;
        this.second=scnd;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][]vis=new int[n][m];
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    count++;
                    bfs(row,col,grid,vis);
                }
            }
        }
        return count;
    }
    public void bfs(int row,int col,char[][] grid,int visited[][]){
        visited[row][col]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        int delRow[]={-1,1,0,0};
        int delCol[]={0,0,1,-1};
        while(!q.isEmpty()){
            int nrow=q.peek().first;
            int ncol=q.peek().second;
            q.poll();

            for(int i=0;i<4;i++){
                int deltaRow=nrow+delRow[i];
                int deltaCol=ncol+delCol[i];

                if(deltaRow>=0 && deltaRow<n && deltaCol>=0 && deltaCol<m && visited[deltaRow]  [deltaCol]==0 && grid[deltaRow][deltaCol]=='1'){
                    visited[deltaRow][deltaCol]=1;
                    q.add(new Pair(deltaRow,deltaCol));
                }
            }
        }

    }
}
