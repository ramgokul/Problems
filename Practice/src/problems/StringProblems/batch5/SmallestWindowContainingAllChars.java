package problems.StringProblems.batch5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestWindowContainingAllChars {

    /*
        Given two strings string1 and string2, find the smallest substring in string1 containing all characters of string2 efficiently.
        For Example:

        Input :  string = "this is a test string"
                 pattern = "tist"
        Output :  Minimum window is "t stri"
        Explanation: "t stri" contains all the characters
                      of pattern.

        Input :  string = "geeksforgeeks"
                 pattern = "ork"
        Output :  Minimum window is "ksfor"
     */

    public static void main(String[] args) {
//        String string = "geeksforgeeks", pattern = "ork";
        String string = "this is a test string", pattern = "tist";

        Map<Character, Integer> map_pat = new HashMap<>();
        Map<Character, Integer> map_str = new HashMap<>();

        for (int i=0; i<pattern.length(); i++){
            map_pat.put(pattern.charAt(i), map_pat.getOrDefault(pattern.charAt(i), 0)+1);
        }

        int count = 0, start = 0, start_index=0;
        int min_len = Integer.MAX_VALUE;

        for (int j=0; j<string.length(); j++){

            char char_str = string.charAt(j);
            map_str.put(char_str, map_str.getOrDefault(char_str, 0)+1);

            if (map_pat.containsKey(char_str) && map_str.get(string.charAt(j)) <= map_pat.get(string.charAt(j))){
                count++;

                if (count == pattern.length()){

                    while (!map_pat.containsKey(string.charAt(start)) && map_str.get(string.charAt(start)) == map_pat.get(string.charAt(start))){

                        if (map_str.get(string.charAt(start)) == 1){
                            map_str.remove(string.charAt(start));
                        }else if (map_str.get(string.charAt(start)) > 1){
                            int counter = map_str.get(string.charAt(start));
                            map_str.put(string.charAt(start),counter-1);
                        }

                        start++;
                    }

                    int len_window = (j - start) + 1;
                    min_len = Math.min(min_len, len_window);
                    start_index = start;
                    start = 0;
                    count = 0;
                }
            }
        }

        System.out.println("Min window length : "+min_len);
        System.out.println("window : "+string.substring(start_index, start_index+min_len));

    }

}
