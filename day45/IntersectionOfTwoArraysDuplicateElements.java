package day45;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArraysDuplicateElements {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : b) {
            if (setA.contains(num)) {
                resultSet.add(num);
            }
        }

        return new ArrayList<>(resultSet);
    }
}
