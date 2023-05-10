/*Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.
*/
class Solution {
    public boolean isPowerOfFour(int n) {
         if(n == 0) return false;
        if(n == 1) return true;
        return n % 4 != 0 ? false: isPowerOfFour(n/4);
    }
}
