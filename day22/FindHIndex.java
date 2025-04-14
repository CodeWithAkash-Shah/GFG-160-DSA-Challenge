package day22;

import java.util.Arrays;

public class FindHIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int Hindex = 0;
        for (int i = 0; i < n; i++) {
            int p = n - i;
            if (citations[i] >= p) {
                Hindex = p;
                break;
            }
        }
        return Hindex;
    }
}