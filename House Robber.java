/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int first=nums[0];
        int second=Math.max(first,nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp=second;
            second=Math.max(second,first+nums[i]);
            first=temp;
        }
        return second;
    }
}
