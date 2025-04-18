package day26;

import java.util.Arrays;
import java.util.Comparator;

public class NonoverlappingIntervals {
    static int minRemoval(int intervals[][]) {
        // code here
        if (intervals.length <= 1)
            return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }

        return intervals.length - count;
    }
}
