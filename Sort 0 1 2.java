import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] nums)
    {
        //Write your code here
         int low = 0; 
        int high = nums.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= high) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[low]; 
                    nums[low] = nums[mid]; 
                    nums[mid] = temp; 
                    low++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[high]; 
                    nums[high] = temp; 
                    high--; 
                    break; 
                } 
            } 
        }
    }
}
