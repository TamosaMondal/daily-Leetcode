/*Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
*/
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>s=new Stack<>();
        int j=0;
        for(int val:pushed){
            s.push(val);
            while(s.size()>0 && s.peek()==popped[j]){
                s.pop();
                j++;
            }
        }
        return s.size()==0;
    }
}
