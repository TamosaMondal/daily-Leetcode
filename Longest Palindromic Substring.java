/*Given a string s, return the longest palindromic substring in s
*/
class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        String ans="";
        int maxLength=0;
        for(int gap=0;gap<s.length();gap++){
            for(int i=0,j=gap;j<s.length();i++,j++){
                if(gap==0){
                    dp[i][j]=true;
                }else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j]){
                    if(j-i+1>maxLength){
                        maxLength=j-i+1;
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}
