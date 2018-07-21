package problems.Misc.batch0;

import java.util.*;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s,t));

    }

    public static char findTheDifference(String s, String t){
        System.out.println(t.charAt(s.length()));
        int charCode = t.charAt(s.length());

        for (int i = 0; i < s.length(); ++i) {
            charCode -= (int)s.charAt(i);
            System.out.println("char1 = "+charCode);
            charCode += (int)t.charAt(i);
            System.out.println("char2 : "+charCode);
        }
        return (char)charCode;
    }
}
