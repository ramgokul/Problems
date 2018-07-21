package problems.StringProblems.batch0;

import java.util.Arrays;

public class Pangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));

    }

    public static boolean isPangram(String s){
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i=0; i<s.length(); i++){

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                index = s.charAt(i) - 'A';
            }else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                index = s.charAt(i) - 'a';
            }

            mark[index] = true;
        }

        System.out.println(Arrays.toString(mark));;
        for (int i=0; i<=25; i++){
            if (mark[i] == false){
                return false;
            }
        }

        return true;
    }
}
