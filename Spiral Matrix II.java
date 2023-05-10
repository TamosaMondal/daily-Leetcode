/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/
class Solution {
    public int[][] generateMatrix(int n) {
        int left=0,right=n-1;
        int top=0,bottom=n-1;

        int [][]arr=new int[n][n];
        int val=1;
        while (top <= bottom && left <= right) {
            // Traverse Right
            for (int i=left; i<=right; i++) {
                arr[top][i]=val++;
            }
            top++; 
            // Traverse Down
            for (int i=top; i<= bottom; i++) {
                arr[i][right]=val++;
            }
            right--;
            if (top <=bottom) {
                // Traverse Left
                for (int i=right; i>=left;i--) {
                    arr[bottom][i]=val++;
                }
            }
            bottom--;
            if (left <= right) {
                // Travese Up
                for (int i=bottom; i>=top; i--) {
                    arr[i][left]=val++;
                }
            }
            left++;
        }
        
        return arr;
    }
}
