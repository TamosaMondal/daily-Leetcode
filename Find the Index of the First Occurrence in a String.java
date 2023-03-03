/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int res=-1;
        if(haystack.contains(needle)){
            int index=haystack.indexOf(needle);
            res=index;
        }
        return res;
    }
}
