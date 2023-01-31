/*The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn
*/
class Solution {
    int fn(int n,int dp[]){
            if(n<=1) return n;
            if(n==2) return 1;
            if(dp[n]!=-1) return dp[n];
            return dp[n]=fn(n-1,dp)+fn(n-2,dp)+fn(n-3,dp);
        }
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fn(n,dp);
    }
}
