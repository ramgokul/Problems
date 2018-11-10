package problems.StringProblems.batch9;

import java.util.HashSet;
import java.util.Set;

public class MaxDistinctLowcaseCharsBwTwoUpperCase {
    /*
        Given a string containing alphabets in lowercase and uppercase, find the maximum count of distinct lowercase alphabets present between two uppercase alphabets.

        Examples :

        Input : zACaAbbaazzC
        Output : The maximum count = 3

        Input : edxedxxxCQiIVmYEUtLi
        Output : The maximum count = 1
     */

    public static void main(String[] args) {
        String s = "zACaAbbaazzC";
        System.out.println(distinct_lowercase(s));
    }

    static int distinct_lowercase(String s){
        Set<Character> set =new HashSet<>();
        int i=0, max_count=0;

        for (;i<s.length();i++){

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                i++;
                break;
            }

        }

        for (;i<s.length();i++){

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                max_count = Math.max(max_count, set.size());
                set.clear();
            }

            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                set.add(s.charAt(i));
            }
        }

        return max_count;
    }
}
