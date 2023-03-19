/*You are given a positive integer n.

Let even denote the number of even indices in the binary representation of n (0-indexed) with value 1.

Let odd denote the number of odd indices in the binary representation of n (0-indexed) with value 1.

Return an integer array answer where answer = [even, odd].

 
*/
class Solution {
    public int[] evenOddBit(int n) {
        int even=0;
        int odd=0;
        String str=Integer.toBinaryString(n);
        String rev=reverse(str);
        for(int i=0;i<rev.length();i++){
            if(rev.charAt(i)=='1' && i%2==0){
                even++;
            }else if(rev.charAt(i)=='1' && i%2!=0){
                odd++;
            }
        }
        int ans[]=new int[2];
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
    public String reverse(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        return rev;
    }
}
