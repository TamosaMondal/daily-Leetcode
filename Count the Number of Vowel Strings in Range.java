/*You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
*/

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            char l=words[i].charAt(0);
            char r=words[i].charAt(words[i].length()-1);
            if((l=='a'||l=='e'||l=='i'||l=='o'||l=='u') && (r=='a'||r=='e'||r=='i'||r=='o'||r=='u')){
                count++;
            }
        }
        return count;
    }
}
