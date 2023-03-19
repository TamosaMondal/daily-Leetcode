/*You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

 
*/
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            }else{
                return n;
            }
        }
        return 0;
    }
}
