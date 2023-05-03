/*Given an m x n matrix, return all elements of the matrix in spiral order.
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1;
        int top=0,bottom=n-1;

        List<Integer> res = new ArrayList<Integer>();
        while (top <= bottom && left <= right) {
            // Traverse Right
            for (int i=left; i<=right; i++) {
                res.add(matrix[top][i]);
            }
            top++; 
            // Traverse Down
            for (int i=top; i<= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <=bottom) {
                // Traverse Left
                for (int i=right; i>=left;i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                // Travese Up
                for (int i=bottom; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }
        
        return res;
    }
}
