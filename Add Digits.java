/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9;
    }
}
