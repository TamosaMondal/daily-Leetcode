/*Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.
*/

class Solution {
    public String greatestLetter(String s) {
        char a='z';
        char b='Z';
        String ans="";
        for(int i=0;i<26;i++){
            if(s.indexOf(a)!=-1&& s.indexOf(b)!=-1){
                return ans+b;
            }else{
                a--;
                b--;
            }
        }
        return ans;
    }
}
