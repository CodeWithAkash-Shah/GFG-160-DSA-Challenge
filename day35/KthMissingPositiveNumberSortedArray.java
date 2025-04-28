package day35;

public class KthMissingPositiveNumberSortedArray {
    public int kthMissing(int[] arr, int k) {
        // code here
       int n = arr.length;
    for (int i = 0; i < n; i++) {
        int missing = arr[i] - (i + 1);
        if (missing >= k) {
            return k + i;
        }
    }
    // If not found in the loop, missing number is after the last element
    return k + n; 
    }
}
