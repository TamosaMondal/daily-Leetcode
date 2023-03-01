/*Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 
*/
class Solution {
    public int[] sortArray(int[] nums) {
        nums=mergeSort(nums);
        return nums;
    }
    public int[]mergeSort(int[]nums){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int firstHalf[]=mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] secondHalf=mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(firstHalf,secondHalf);
    }
    public int[]merge(int[]firstHalf,int[]secondHalf){
        int i=0,j=0,k=0;
        int res[]=new int[firstHalf.length+secondHalf.length];
        while(i<firstHalf.length && j<secondHalf.length){
            if(firstHalf[i]<secondHalf[j]){
                res[k++]=firstHalf[i++];
            }else{
                res[k++]=secondHalf[j++];
            }
        }
        while(i<firstHalf.length){
            res[k++]=firstHalf[i++];
        }
        while(j<secondHalf.length){
            res[k++]=secondHalf[j++];
        }
        return res;
    }
}
