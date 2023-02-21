/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
            int e = 0;
            for (int i = 0; i < n; i++) {
                e = e ^ nums[i];
        }
        
        return e;
    }
}
