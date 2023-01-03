/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

class Solution {
    public boolean isMatching(char a,char b){
        return (a==')' && b=='(') ||
            (a==']' && b=='[')||
            (a=='}' && b=='{');
            
    }
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(!isMatching(ch,st.peek())){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
