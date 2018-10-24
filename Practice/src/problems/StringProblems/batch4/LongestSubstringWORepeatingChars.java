package problems.StringProblems.batch4;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWORepeatingChars {

    /*
        Given a string, find the length of the longest substring without repeating characters.
        For example, the longest substrings without repeating characters for “ABDEFGABEF” are “BDEFGA” and “DEFGAB”, with length 6.
        For “BBBB” the longest substring is “B”, with length 1.
        For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7.
     */

    public static void main(String[] args) {
        String string = "BBBB";
        longest_substring(string);
    }

    static void longest_substring(String string){
        int max_so_far = 0;
        int current_max = 0;

        Set<Character> set = new HashSet<>();

        for (int i=0; i<string.length(); i++){

            if (!set.contains(string.charAt(i))){
                set.add(string.charAt(i));
                current_max++;
            }else {
                max_so_far = Math.max(max_so_far, current_max);
                current_max = 0;
                set.clear();
            }
        }

        System.out.println("Longest substring : "+max_so_far);
    }

}
