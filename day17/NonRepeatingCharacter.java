import java.util.HashMap;

public class NonRepeatingCharacter {
    static char nonRepeatingChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(char st : s.toCharArray()){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        
        for(char ch : s.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return '$';
    }
}
