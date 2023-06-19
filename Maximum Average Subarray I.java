/*You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-nums[i];
                i++;
                j++;
                
            }
        }
        return (double)max/k;
    }
}
