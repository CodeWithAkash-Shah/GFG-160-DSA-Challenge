package day49;

import java.util.HashMap;

public class SubarrayswithsumK {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle subarrays starting from index 0
        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
