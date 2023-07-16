/*Sample Input 1:
6
4 7 8 6 7 6 
Sample Output 1:
8
Explanation Of Sample Input 1:
The answer is 8.
From {4 7 8 6 7 6}, 8 is the largest element.
*/
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
