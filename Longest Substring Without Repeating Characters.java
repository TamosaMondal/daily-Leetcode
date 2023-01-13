/*Given a string s, find the length of the longest substring without repeating characters.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        HashSet<Character>set=new HashSet<>();
        int maxLength=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(set.add(c)){
                maxLength=Math.max(maxLength,right-left+1);
                right++;
            }else{
                while(s.charAt(left)!=c){
                    set.remove(s.charAt(left));//
                    left++;
                }
                set.remove(c);
                left++;
            }
            
        }
        return maxLength;
    }
}
