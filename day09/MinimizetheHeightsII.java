package day09;

import java.util.Arrays;

public class MinimizetheHeightsII {

    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int tallest = arr[n-1];
        int shortest = arr[0];
        int minDiff = tallest-shortest;
        for(int i=1;i<n;i++){
            tallest = Math.max(arr[n-1]-k,arr[i-1]+k);
            shortest = Math.min(arr[0]+k,arr[i]-k);
            if(shortest<0) continue;
            minDiff = Math.min(minDiff,tallest-shortest);
        }
        return minDiff;
    }
}