import java.util.HashSet;

public class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hash.add(arr[i]);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!hash.contains(i))
                return i;
        }
        return -1;
    }
}
