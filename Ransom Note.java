/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0 ){
                return false;
            }
            map.put(ch, map.get(ch) - 1);

        }
        return true;
    }
}
