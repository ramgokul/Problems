package problems.StringProblems.batch9;

import java.util.Set;
import java.util.TreeSet;

public class SortedOrderFollowedByIntSum {

    /*
        Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.

        Examples:

        Input : AC2BEW3
        Output : ABCEW5
        Alphabets in the lexicographic order
        followed by the sum of integers(2 and 3).
        Asked in : Facebook
     */

    public static void main(String[] args) {
        String s = "AC2BEW3";
        sorted_order(s);
    }

    static void sorted_order(String s){
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new TreeSet<>();

        for (int i=0; i<s.length(); i++){
            char x = s.charAt(i);

            if (Character.isAlphabetic(x)){
                set.add(x);
            }else {
                sum += Integer.parseInt(String.valueOf(x));
            }
        }

        for (char y : set){
            sb.append(y);
        }
        System.out.println(sb.append(sum).toString());
    }
}
