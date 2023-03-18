/*You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.
*/
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int k,sum=0,sum1=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int j=0;j<n;j++){
            while(nums[j] > 0){
                k = nums[j] % 10;
                sum1 = sum1 + k;
                nums[j] = nums[j] / 10;
            }
        }
        return Math.abs(sum-sum1);
    }
}
