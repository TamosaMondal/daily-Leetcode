/*Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.
*/
class Solution {
    public int compress(char[] chars) {
        int count=1;
        String ans="";
        ans+=chars[0];
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                if(count>1){
                    ans+=count;
                }
                count=1;
                ans+=chars[i];
            }
        }
        if(count>1){
            ans+=count;
        }
        for (int i=0;i<ans.length();i++)
            chars[i]=ans.charAt(i);
        return ans.length();
    }
}
