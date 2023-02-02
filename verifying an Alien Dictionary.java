/*In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

 
*/
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[]arr=new int[26];
        int seq=0;
        for(char c:order.toCharArray()){
            arr[c-'a']=seq++;
        }
        for(int i=0;i<words.length-1;i++){
            String cur=words[i];
            String next=words[i+1];
            int len=Math.min(cur.length(),next.length());
            if(len!=cur.length() && cur.startsWith(next)){
                return false;
            }
            for(int l=0;l<len;l++){
                if(arr[cur.charAt(l)-'a']>arr[next.charAt(l)-'a']){
                    return false;
                }
                if(arr[cur.charAt(l)-'a']<arr[next.charAt(l)-'a']){
                    break;
                }
            }
        }
        return true;
    }
}
