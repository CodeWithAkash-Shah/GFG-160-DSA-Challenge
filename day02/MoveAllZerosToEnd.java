package day02;

public class MoveAllZerosToEnd {

    void Swap(int i, int count, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }

    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                Swap(i, count, arr);
                count += 1;
            }
        }
    }
}