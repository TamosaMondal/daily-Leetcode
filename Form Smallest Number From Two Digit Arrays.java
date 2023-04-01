/*Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
*/
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                return nums2[j];
            }
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            min2=Math.min(min2,nums2[i]);
        }
        if(min1<min2){
            return min1*10+min2;
        }
        return min2*10+min1;
    }
}
