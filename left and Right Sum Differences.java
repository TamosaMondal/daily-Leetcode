/*Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
*/

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int ans[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            leftSum[i]=sum;
        }
        for(int i=nums.length-1;i>=0;i--){
            int sum=0;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
            }
            rightSum[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}
