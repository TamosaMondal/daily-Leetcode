/*Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
*/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Set<Integer> set1 = new HashSet<Integer>();
        for(int n : nums1) set1.add(n);

        Set<Integer> set2 = new HashSet<Integer>();        
        for(int n : nums2) set2.add(n);

        List<Integer> ans1 = new ArrayList<Integer>();
        for (int n : set1){
            if(set2.contains(n) == false){
                ans1.add(n);
            }
        }
        List<Integer> ans2 = new ArrayList<Integer>();
        for (int n : set2){
            if(set1.contains(n) == false){
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
