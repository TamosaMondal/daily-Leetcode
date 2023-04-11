/*You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
*/
class Solution {
    public String removeStars(String s) {
        /*char [] c=s.toCharArray();
        int i=0;
        int j=0;
        int n=s.length();
        while(j<n){
            if(c[j]=='*'){
                i--;
            }else{
                c[i++]=c[j];
            }
            j++;
        }
        String ans="";
        for(int k=0;k<i;k++){
            ans+=c[k];
        }
        return ans;*/

        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        for(char e:stack){
            ans+=e;
        }
        return ans;
    }
}
