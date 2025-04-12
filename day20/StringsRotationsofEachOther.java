package day20;

public class StringsRotationsofEachOther {

    static boolean kmpSearch(String text, String pattern){
        int [] lps = computeLPSArray(pattern);
        int i=0,j=0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;j++;
                if(j==pattern.length()) return true;
            }else{
                if(j!=0) j=lps[j-1];
                else i++;
            }
        }
        return false;
    }
    
    static int[] computeLPSArray(String pattern){
        int [] lps = new int[pattern.length()];
        int len=0,i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0) len=lps[len-1];
                else{ lps[i]=0; i++;} 
            }
        }
        return lps;
    }
    
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        String temp = s1+s1;
        return kmpSearch(temp,s2);
    }
}