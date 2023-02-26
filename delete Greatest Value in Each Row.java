/*You are given an m x n matrix grid consisting of positive integers.

Perform the following operation until grid becomes empty:

Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
Add the maximum of deleted elements to the answer.
Note that the number of columns decreases by one after each operation.

Return the answer after performing the operations described above.
*/

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i[]:grid){
           Arrays.sort(i);
       }
       int ans = 0;
       for(int j=0;j<grid[0].length;j++){
           int m = 0;
           for(int row[]:grid){
               m = Math.max(m,row[j]);
           }
           ans += m;
       }
       return ans;
    }
}
