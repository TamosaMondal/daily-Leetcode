/*Given an array, rotate the array to the right by k steps, where k is non-negative.
*/
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotateArr(nums,0,nums.length-1);
        rotateArr(nums,0,k-1);
        rotateArr(nums,k,nums.length-1);
    }
    void rotateArr(int arr[], int start, int end){ 
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }  
}
