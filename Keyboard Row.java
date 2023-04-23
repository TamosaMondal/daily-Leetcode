/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

*/
class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiopQWERTYUIOP";
        String b = "asdfghjklASDFGHJKL";
        String c = "zxcvbnmZXCVBNM";

        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        HashSet<Character> set3 = new HashSet<Character>();
        for(int i=0; i<a.length(); i++){
            set1.add(a.charAt(i));
        }
        for(int i=0; i<b.length(); i++){
            set2.add(b.charAt(i));
        }
        for(int i=0; i<c.length(); i++){
            set3.add(c.charAt(i));
        }

        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int j=0; j<temp.length(); j++){
                if(set1.contains(temp.charAt(j))) count1++;
                else if(set2.contains(temp.charAt(j))) count2++;
                else if(set3.contains(temp.charAt(j))) count3++;
            }
            if(count1==temp.length()||count2==temp.length()||count3==temp.length()){
                arr.add(temp);
            }
        }
        return arr.toArray(new String[0]);
    }
}
