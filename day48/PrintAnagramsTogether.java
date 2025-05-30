package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PrintAnagramsTogether {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();

        for (String str : arr) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                order.add(key);
            }
            map.get(key).add(str);
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (String key : order)
            res.add(map.get(key));
        return res;
    }
}
