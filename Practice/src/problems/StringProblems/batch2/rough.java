package problems.StringProblems.batch2;

import java.util.Arrays;
import java.util.StringJoiner;

public class rough {

    public static void main(String[] args) {
        String s = "ramnath";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
        String s1 = new String(c);
        System.out.println(s1.hashCode());


    }
}
