package day25;

import java.util.ArrayList;

public class InsertInterval {

    class Solution {
        static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
            // code here
            ArrayList<int[]> result = new ArrayList<>();

            int i = 0;
            int n = intervals.length;

            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }

            // Merge overlapping intervals
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }

            // Add the merged interval
            result.add(newInterval);

            // Add all intervals that start after the new interval ends
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }

            return result;
        }
    }
}