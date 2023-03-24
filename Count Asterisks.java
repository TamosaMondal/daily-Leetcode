/*You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.

 
*/
class Solution {
    public int countAsterisks(String s) {
        int bar = 0;
        int count= 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                bar++;
            }
            if (bar % 2 == 0 && s.charAt(i) == '*') {
                count++;
            }
        }
        return count;
    }
}
