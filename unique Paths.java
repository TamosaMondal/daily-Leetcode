/*There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

 
*/

class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int [m][n];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=1;
        }
        for(int j=0;j<dp.length;j++){
            dp[j][0]=1;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
/*  m=3,n=7
    1   1   1   1   1   1   1
    1   2   3   4   5   6   7
    1   3   6   10  15  21  28

*/
