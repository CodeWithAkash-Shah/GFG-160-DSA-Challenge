public class SearchInRotatedSortedArray {
    int search(int[] arr, int key) {
        // Complete this function
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (key == arr[mid]) {
                return mid;
            }

            // Checking if left part is sorted
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= key && key <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < key && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
