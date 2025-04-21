package day29;

public class SortedandRotatedMinimum {

    // User function Template for Java

    class Solution {
        public int findMin(int[] arr) {
            // complete the function here
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }
            return min;
        }
    }
}