/*You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks. The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.

Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.*/



class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            for(int j=0;j<rocks.length;j++){
                capacity[j]=capacity[j]-rocks[j];
            }
            Arrays.sort(capacity);
            int count=0;
            for(int j=0;j<rocks.length;j++){
                if(capacity[j]==0) count++;
                else if(additionalRocks>=capacity[j]){
                    count++;
                    additionalRocks-=capacity[j];
                }else{
                    break;
                }
            }
            return count;
    }
}
