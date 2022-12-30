/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.*/


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        ArrayList<Integer>a=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                a.add(nums1[i]);
                i++;
                j++;
            }
        }
        int ans[]=new int[a.size()];
        int k=0;
        for(int e:a){
            ans[k++]=e;
        }
        return ans;
    }
}
