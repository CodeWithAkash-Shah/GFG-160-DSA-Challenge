package day11;

public class MaximumProductSubarray {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int MaxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;
            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            MaxProduct = Math.max(MaxProduct, Math.max(prefix, suffix));
        }
        return MaxProduct;
    }
}