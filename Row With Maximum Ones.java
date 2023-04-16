/*Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.
*/
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int x=mat.length;
        int y=mat[0].length;
        int res[]=new int[2];
        int max=0;
        for(int i=0;i<x;i++){
            int countOnes=0;
            for(int j=0;j<y;j++){
                if(mat[i][j]==1){
                    countOnes++;
                }
            }
            if(countOnes>max){
                max=countOnes;
                res[0]=i;
                res[1]=max;
            }
        }
        return res;
        
    }
}
