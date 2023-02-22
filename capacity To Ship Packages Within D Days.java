/*A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

 
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int val :weights){
            sum +=val;
            max = Math.max(max,val);
        }
        if(weights.length==days){
            return max;
        }
        int low=max;
        int high = sum;
        int ans=0;
        while(low<=high){
           int mid = low+(high-low)/2;
            if(isPossible(weights,mid,days)==true){
                ans = mid;
                high= mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int weight[],int mid,int days){
        int d=1;
        int sum=0;
        for(int i=0;i<weight.length;i++){
            sum+=weight[i];
            if(sum>mid){
                d++;
                sum=weight[i];
            }
        }
        return d<=days;
    }
    
    }














