/*Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.
*/
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int cur=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<cur) return true;
            while(!st.isEmpty() && st.peek()<nums[i]){
                cur=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
