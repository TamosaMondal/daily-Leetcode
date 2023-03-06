/*Given a positive integer num, split it into two non-negative integers num1 and num2 such that:

The concatenation of num1 and num2 is a permutation of num.
In other words, the sum of the number of occurrences of each digit in num1 and num2 is equal to the number of occurrences of that digit in num.
num1 and num2 can contain leading zeros.
Return the minimum possible sum of num1 and num2.
*/

class Solution {
    public int splitNum(int num) {
        int []ans=new int[10];
        while(num>0){
            ans[num%10]++;
            num/=10;
        }
        
        int num1=0;
        int num2=0;
        
        for(int i=0;i<10;i++){
            for(int j=0;j<ans[i];j++){
                if(num1<=num2){
                    num1=num1*10+i;
                }
                else{
                    num2=num2*10+i;
                }
            }
        }
        return num1+num2;
    }
}
