/*You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
*/

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            int left = 0;
            int right = m-1;
            while (left<=right) {
                int mid = (left+right)/2;
                long product = (long)spells[i] * potions[mid];
                if (product>=success){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i] = m-left;
        }
        return ans;
    }
}
