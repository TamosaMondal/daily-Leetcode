/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/

class Solution {
    public String reverseWords(String s) {
        int j=0;
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                reverse(j,i-1,arr);
                j=i+1;
            }
            else if(i==arr.length-1){
                reverse(j,i,arr);
            }
        }
        return new String(arr);
    }
    public void reverse(int start,int end,char[]arr){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
