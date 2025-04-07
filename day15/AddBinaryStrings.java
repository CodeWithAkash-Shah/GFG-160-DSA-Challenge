package day15;

public class AddBinaryStrings {

    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder res = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if(i>=0){
                sum+=s1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=s2.charAt(j)-'0';
                j--;
            }
            res.append(sum%2);
            carry=sum/2;
        }
        String result = res.reverse().toString();
        int idx = 0;
        while(idx<result.length()-1 && result.charAt(idx)=='0'){
            idx++;
        }
        return result.substring(idx);
    }
}