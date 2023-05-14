/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        int curSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length - 2; i++) {
            int left = i + 1;
            int right=nums.length - 1;

            while (left<right) {
                curSum = nums[i] + nums[left] + nums[right];
                if (curSum==target) {
                    return curSum;
                } 
                else if (Math.abs(target - curSum) < Math.abs(target - closestSum)) {
                    closestSum=curSum;
                }
                if (curSum <= target) {
                    left += 1;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left += 1;
                    }
                } else {
                    right -= 1;
                }
            }
        }
        return closestSum;
    }
}
