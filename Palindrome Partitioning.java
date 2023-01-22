/*Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s
*/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> cur=new ArrayList<>();
        fn(0,s,cur,res);
        return res;
    }
    void fn(int index,String s,List<String> cur,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                cur.add(s.substring(index,i+1));
                fn(i+1,s,cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
