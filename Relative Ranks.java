/*You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.
*/
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        Map<Integer, String> map = new HashMap<>();
        int[] sortScore = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            sortScore[i] = score[i];
        }
        Arrays.sort(sortScore);
        int count = 0;
        for (int i = sortScore.length - 1; i >= 0; i--) {
            count++;
            if (count == 1) {
                map.put(sortScore[i], "Gold Medal");
            } else if (count == 2) {
                map.put(sortScore[i], "Silver Medal");
            } else if (count == 3) {
                map.put(sortScore[i], "Bronze Medal");
            } else {
                map.put(sortScore[i], Integer.toString(count));
            }
        }

        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }
        
        return ans; 
    }
}
