/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
*/
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i =Integer.MAX_VALUE;
        int j =Integer.MAX_VALUE;
        for(int n : nums) {
           if(n <= i) i = n;
           else if(n <=j) j = n;
           else return true;
       }
       return false;
    }
}
