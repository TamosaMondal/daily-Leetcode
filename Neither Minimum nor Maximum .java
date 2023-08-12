/*Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.
*/
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        if(n<3) return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
