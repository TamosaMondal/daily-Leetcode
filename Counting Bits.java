/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
*/
class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=recursive(i);
        }
        return ans;
    }
    public static int recursive(int num){
        if(num==0) return 0;
        if (num==1) return 1;
        if(num%2==0) return recursive(num/2);
        else return 1+recursive(num/2);

    }
}
