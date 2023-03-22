/*You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.
*/

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int max[][] = new int[n-2][n-2];
        for(int i=0; i<n-2;i++){
            for(int j=0; j<n-2; j++){
                max[i][j] = maxFind(grid,i,j);
            }
        }
        return max;
    }
    public int maxFind(int arr[][], int x, int y){
        int max = Integer.MIN_VALUE;
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
}
