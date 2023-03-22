/*Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.
*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = n-i;
            int k = left * right;
            int odd = (k+1)/2;
            sum = sum + odd*arr[i];
        }
        return sum;

    }
}
