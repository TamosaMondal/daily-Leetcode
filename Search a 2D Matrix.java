/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        for(int i=0; i< matrix.length; i++){
            if(Arrays.binarySearch(matrix[i], target) >= 0) return true;
        }
        return false;*/
      
      //2ND APPROACH---->
      
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(matrix[i][j]==target){
                   return true;
               }
            }
        }
        return false;
    }
}
