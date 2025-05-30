import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet()<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) { // start of a sequence
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
