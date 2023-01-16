/*Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.
*/
class Solution {
    public int[][] updateMatrix(int[][] mat) {
    int m=mat.length;
    int n=mat[0].length;
    Queue<int[]>q=new LinkedList<>();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
                q.offer(new int[]{i,j});
            }else{
                mat[i][j]=-1;
            }
        }
    }
    int [][]dir={{-1,0},{1,0},{0,-1},{0,1}};
    while(!q.isEmpty()){
        int[]cell=q.poll();
        for(int[]d:dir){
            int r=cell[0]+d[0];
            int c=cell[1]+d[1];
            if(r<0||r>=m||c<0||c>=n||mat[r][c]!=-1) continue;
            q.add(new int[]{r,c});
            mat[r][c]=mat[cell[0]][cell[1]]+1;
        }
    }
    return mat;
    }
} 
