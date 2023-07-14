/*Given an integer array arr and an integer difference, return the length of the longest subsequence in arr which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals difference.

A subsequence is a sequence that can be derived from arr by deleting some or no elements without changing the order of the remaining elements.
*/
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (map.containsKey(x - difference))
                map.put(x, map.get(x - difference) + 1);
            else
                map.put(x, 1);
            ans=Math.max(ans, map.get(x));
        }
        return ans;
    }
}
