import java.util.HashMap;
import java.util.Map;

public class Anagram {

        public static boolean areAnagrams(String s1, String s2) {
        
        // Your code here
        if(s1.length()!=s2.length()) return false;
        //TC  : N log N 
        // char[] str1 = s1.toCharArray();
        // char[] str2 = s2.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // for(int i=0;i<str1.length;i++){
        //     if(str1[i]!=str2[i]) return false;
        // }
        // return true;
        // TC O(N)
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}