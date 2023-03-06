/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
*/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int []a=new int[2001];
        for(int val:arr){
            a[val]++;
        }
        int count=0;
        for(int i=1;i<=2000;i++){
            if(a[i]==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}
