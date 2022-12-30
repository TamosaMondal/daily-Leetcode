/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/




class Solution {
    public int maxProfit(int[] prices) {
        //T.C-O(N)
        int minSoFar=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
             minSoFar=Math.min(minSoFar,prices[i]);
             int profit=prices[i]-minSoFar;
             maxProfit=Math.max(maxProfit,profit);
         }
         return maxProfit;
    }
}
