public class ImplementAtoi {
    public int myAtoi(String s) {
        // Your code here
        int n = s.length();
        if(n==0) return 0;
        
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        s=s.substring(i);
        
        long answer = 0;
        int sign = 1;
        
        if(s.charAt(0)=='-') sign=-1;
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        i=(s.charAt(0)=='+' || s.charAt(0) == '-') ? 1 : 0;
        
        while(i<s.length()){
            if(s.charAt(0) == ' ' || !Character.isDigit(s.charAt(i))) break;
            
            answer = answer*10+(s.charAt(i)-'0');
            if(sign==-1 && -1*answer<min) return min;
            if(sign==1 && answer> max) return max;
            i++;
        }
        return (int) (sign*answer);
    }
}
