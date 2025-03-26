package day03;

public class ReverseArray {

    void swap(int right, int left, int[] arr) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    public void reverseArray(int arr[]) {
        // code here
        int right = arr.length - 1;
        int left = 0;
        while (right > left) {
            swap(right, left, arr);
            right--;
            left++;
        }
    }
}