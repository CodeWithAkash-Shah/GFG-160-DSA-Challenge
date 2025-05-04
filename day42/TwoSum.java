package day42;

import java.util.HashSet;

public class TwoSum {

    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> hash = new HashSet<>();
        for (int num : arr) {
            if (hash.contains(target - num))
                return true;
            hash.add(num);
        }
        return false;
    }
}