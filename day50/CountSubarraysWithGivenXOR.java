package day50;

import java.util.HashMap;

public class CountSubarraysWithGivenXOR {
     public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        long count = 0;

        for (int num : arr) {
            xor ^= num;

            if (xor == k)
                count++;

            int required = xor ^ k;
            count += map.getOrDefault(required, 0);

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
