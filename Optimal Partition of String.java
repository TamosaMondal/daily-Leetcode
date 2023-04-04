/*Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.
*/
class Solution {
    public int partitionString(String s) {
        int ans=1;
        HashSet<Character>set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                ans++;
                set.clear();
            }
            set.add(c);
        }
        return ans;
    }
}
