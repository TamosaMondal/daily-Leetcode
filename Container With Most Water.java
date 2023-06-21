/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*/
class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            maxWater=Math.max(maxWater,Math.min(height[left], height[right])*(right-left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}
