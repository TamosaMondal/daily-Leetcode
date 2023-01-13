/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2) return false;
        int[] arr = new int[26];
        for(int i=0;i<len1;i++){
            arr[s1.charAt(i)-'a']++;
         }
         for(int i = 0;i<len2;i++){
            arr[s2.charAt(i)-'a']--;
            if(i-len1 >= 0)
                arr[s2.charAt(i-len1)-'a']++;
            if(totalZero(arr)) return true;
        }
        return false;
    }
    public boolean totalZero(int[] arr){
       for(int i =0 ;i<26;i++){
           if(arr[i] != 0) return false;
       }
       return true;
    }
}
