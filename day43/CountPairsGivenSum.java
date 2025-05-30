package day43;

public class CountPairsGivenSum {

    int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // If the complement exists, add its frequency to count
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            // Increase the frequency of the current number
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}