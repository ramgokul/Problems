package problems.StringProblems.batch6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BothHalvesHaveSameChars {

    /*
        Given a string of lowercase characters only, the task is to check if it is possible to split a string from middle which will gives two halves having the same characters and same frequency of each character. If the length of the given string is ODD then ignore the middle element and check for the rest.

        Examples:

        Input : abbaab
        Output : NO
        The two halves contain the same characters
        but their frequencies do not match so they
        are NOT CORRECT

        Input : abccab
        Output : YES
     */

    public static void main(String[] args) {
        String string = "abcab";
        int len = string.length();
        String second_part = null, first_part = null;

        if (len % 2 == 0){
             second_part = string.substring(3, len);
             first_part = string.substring(0, len/2);

        }else {
            second_part = string.substring(len/2+1, len);
            first_part = string.substring(0, len/2);
        }

        System.out.println("First part : "+first_part);
        System.out.println("Second part : "+second_part);

        char[] c1 = first_part.toCharArray();
        char[] c2 = second_part.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.equals(c1, c2));

        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();




        /* Concatenate string with uncommon characters */
        for (char cx : "aacdb".toCharArray()){
            s1.add(cx);
        }

        for (char cy : "gafd".toCharArray()){
            s2.add(cy);
        }

        Set<Character> s3 = new HashSet<>(s1);
        s3.retainAll(s2);

        System.out.println(s3);

        StringBuilder sb = new StringBuilder();

        for (char x : s1){
            if (!s3.contains(x)){
                sb.append(x);
            }
        }

        for (char y : s2){
            if (!s3.contains(y)){
                sb.append(y);
            }
        }
        System.out.println(sb.toString());

    }
}
