/*You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.
*/
class Solution {
    int sum = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
       for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    sum = 0; 
                    dfs(grid,i,j);
                    max  = Math.max(max,sum);
                }
            }
        }
        return max;
 }
    public void dfs(int[][] grid ,int r ,int c){
        if(r>=grid.length || c>=grid[0].length || r<0|| c<0 || grid[r][c]==0){
            return ;
        }
        sum++;
        grid[r][c] = 0;
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
    }
}
