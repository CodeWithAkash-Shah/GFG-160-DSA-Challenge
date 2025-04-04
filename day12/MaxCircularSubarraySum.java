package day12;

public class MaxCircularSubarraySum {

    public int circularSubarraySum(int arr[]) {

        // Your code here
        int curMin = 0;
        int minSum = arr[0];
        int currMax = 0;
        int maxSum = arr[0];
        int totalSum = 0;
        
        for(int i : arr){
            // Max valur of max subarray
            currMax = Math.max(currMax+i,i);
            maxSum = Math.max(maxSum,currMax);
            
            // min value of min subarray
            curMin = Math.min(curMin+i,i);
            minSum = Math.min(minSum,curMin);
            
            totalSum += i;
        }
        return maxSum>0?Math.max(maxSum, totalSum-minSum) : maxSum;
    }
}