public class MinCharstoAddforPalindrome {
    public static int minChar(String s) {
        // Write your code here
        int n = s.length();
        String revStr = new StringBuilder(s).reverse().toString();
        String combined = s+"$"+revStr;
        
        int [] lps = new int[combined.length()];
        for(int i=1;i<combined.length();i++){
            int j = lps[i-1];
            while(j>0 && combined.charAt(i)!=combined.charAt(j)){
                j=lps[j-1];
            }
            if(combined.charAt(i)==combined.charAt(j)){
                j++;
            }
            lps[i]=j;
        }
        return n-lps[combined.length()-1];
    }
}
