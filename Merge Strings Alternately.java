/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i=0,j=0;
        String ans = new String();
        while(i<n || j<m){
            if(i<n) ans+=word1.charAt(i++);
            if(j<m) ans+=word2.charAt(j++);
        }
        return ans;
    }
}
