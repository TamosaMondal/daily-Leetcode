/*You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
*/
class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length ;
        int count=0;
        while(n>0){
            count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] >= n){
                    count++;
            }
         }
        if(count == n){
         return n;
        }
        n--;
    }
    return -1;
    }
}
