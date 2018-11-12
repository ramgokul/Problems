package problems.StringProblems.batch10;

import java.util.HashMap;
import java.util.Map;

public class MinInsertionsToFormPalindrome {

    /*
        Given a string, find the minimum number of characters to be inserted to convert it to palindrome.
        Before we go further, let us understand with few examples:

        ab: Number of insertions required is 1 i.e. bab
        aa: Number of insertions required is 0 i.e. aa
        abcd: Number of insertions required is 3 i.e. dcbabcd
        abcda: Number of insertions required is 2 i.e. adcbcda which is same as number of insertions in the substring bcd(Why?).
        abcde: Number of insertions required is 4 i.e. edcbabcde
     */

    public static void main(String[] args) {
        String s = "abcda";
        min_insertions(s);
    }

    static void min_insertions(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int odd_count = 0;
        for (int val : map.values()){
            if (val % 2 == 1){
                odd_count++;
            }
        }

        if (odd_count <= 1){
            System.out.println("Min insertions required : 0");
        }else {
            System.out.println("Min insertions required : "+(odd_count - 1));
        }
    }
}
