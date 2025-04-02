package day10;

public class KadanesAlgorithm {

        int maxSubarraySum(int[] arr) {
            // Your code here
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(sum>max) max=sum;
                if(sum<0) sum=0;
            }
            return max;
        }
}