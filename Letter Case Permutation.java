/*Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. Return the output in any order.
*/
class Solution {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> res=new LinkedList<>();
        res.add(s);
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                int size=res.size();
                while(size-- >0){
                    String str=res.poll();
                    String left=str.substring(0,i);
                    String right=str.substring(i+1,n);
                    res.add(left+Character.toLowerCase(c)+right);
                     res.add(left+Character.toUpperCase(c)+right);
                }
            }
        }
        return res;
    }
}
