package day18;

import java.util.ArrayList;

public class SearchPatternKMPAlgorithm {

    void computelps(String pat, int[] lps){
        int len = 0;
        lps[0] = 0;
        int i = 1;
        
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    
        ArrayList<Integer> search(String pat, String txt) {
            // your code here
            ArrayList<Integer> result = new ArrayList<>();
            int m = pat.length();
            int n = txt.length();
            
            // Step 1 
            int [] lps = new int[m];
            computelps(pat,lps);
            
            // step 2 
            int i = 0;
            int j=0;
            while(i<n){
                if(pat.charAt(j)==txt.charAt(i)){
                    i++;j++;
                }
                if(j==m){
                    result.add(i-j);
                    j=lps[j-1];
                }else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                    if(j!=0){
                        j=lps[j-1];
                    }else{
                        i++;
                    }
                }
            }
            return result;
            
        }
    }
