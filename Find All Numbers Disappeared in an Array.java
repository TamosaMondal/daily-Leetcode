/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
           if(!set.contains(i)) res.add(i);
        }
        return res;

    }
}
