package day34;

public class AllocateMinimumPages {
    public static int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int studentsRequired = 1;
        int pagesSum = 0;

        for (int pages : arr) {
            if (pagesSum + pages > maxPages) {
                studentsRequired++;
                pagesSum = pages;

                if (studentsRequired > k) {
                    return false;
                }
            } else {
                pagesSum += pages;
            }
        }

        return true;
    }

}
