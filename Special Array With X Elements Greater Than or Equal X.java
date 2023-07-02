/*You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
*/
class Solution {
    public int specialArray(int[] nums) {
            for(int i=1;i<=nums.length;i++){
                int count=0;
                for(int num:nums){
                    if(num>=i){
                        count++;
                    }
                }
                if(count==i){
                    return i;
                }
            }
            return -1;
    }
}
