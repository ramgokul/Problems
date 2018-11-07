package problems.StringProblems.batch7;

import java.util.Arrays;

public class MultiplyTwoLargeNumbers {

    public static void main(String[] args) {
        System.out.println(multiply("125", "5"));
    }

    public static String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num1.length()==0||num2.length()==0) return "";
        if(num1.equals("0")||num2.equals("0")) return "0";
        char[] c1=new StringBuilder(num1).reverse().toString().toCharArray();
        char[] c2=new StringBuilder(num2).reverse().toString().toCharArray();
        char[] c=new char[c1.length+c2.length+1];
        Arrays.fill(c,'0');
        for(int i=0;i<c2.length;i++){
            int dig2=c2[i]-'0';
            int carry=0;
            for(int j=0;j<c1.length;j++){
                int dig1=c1[j]-'0';
                int temp=c[i+j]-'0';
                int cur=dig1*dig2+temp+carry;
                c[i+j]=(char) (cur%10+'0');
                carry=cur/10;
            }
            c[i+c1.length]=(char) (carry+'0');
        }
        String ret=new StringBuilder(new String(c)).reverse().toString();
        int pos=0;
        while(ret.charAt(pos)=='0'&&pos<ret.length()) pos++;
        return ret.substring(pos);
    }

}
