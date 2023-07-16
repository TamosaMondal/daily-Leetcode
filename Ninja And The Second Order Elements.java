/*Sample Input 1 :
4
3 4 5 2
Sample Output 1 :
4 3
Explanation For Sample Input 1 :
The second largest element after 5 is 4 only and the second smallest element after 2 is 3.
*/
public class Solution {
    private static int secondLargest(int[] a, int n){
        int largest = a[0];
        int sLargest = -1;
        for(int i = 1; i < n; i++){
            if(largest < a[i]){
                sLargest = largest;
                largest = a[i];
            }
            else if(largest > a[i] && sLargest < a[i]){
                sLargest = a[i];
            }
        }
        return sLargest;
    }
    private static int secondSmallest(int[] a, int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            if(smallest > a[i]){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(smallest < a[i] && ssmallest > a[i]){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] res = new int[2];
        res[0] =secondLargest(a,n);
        res[1] =secondSmallest(a,n);
        return res;
    }
}
