import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public List<int[]> mergeOverlap(int[][] arr) {
        // sort by starting time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        for (int[] interval : arr) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged;
    }
}
