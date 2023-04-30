/*You are given two 0-indexed integer permutations A and B of length n.

A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.

Return the prefix common array of A and B.

A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.
*/
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]=new int[A.length];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int n=i;n>=0;n--){
                set.add(A[n]);
            }
            for(int n=i;n>=0;n--){
                if(set.contains(B[n])){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
