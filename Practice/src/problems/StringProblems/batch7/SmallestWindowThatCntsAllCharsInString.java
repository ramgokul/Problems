package problems.StringProblems.batch7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestWindowThatCntsAllCharsInString {
    static int MAX_CHARS = 256;

    /*
        Given a string, find the smallest window length with all distinct characters of the given string. For eg. str = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca” .

        Examples:

        Input  : aabcbcdbca
        Output : dcba
        Explanation :
        dbca of length 4 is the smallest
        window with highest number of distinct
        characters.

        Input : aaab
        Output : ab
        Explanation :
        ab of length 2 is the smallest window
        with highest number of distinct characters.
     */

    public static void main(String[] args) {
        String s1 = "aabcbcdbca";
        smallest_window(s1);
//        findSubString(s1);
    }

    static void smallest_window(String s1){
        Set<Character> set = new HashSet<>();

        for (char c1 : s1.toCharArray()){
            set.add(c1);
        }

        int[] arr_pat = new int[MAX_CHARS];
        int[] arr_str = new int[MAX_CHARS];

        for (char c : set){
            arr_pat[c]++;
        }

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE, count = 0, len_so_far=0;

        for (int i=0; i<s1.length(); i++){

            char c = s1.charAt(i);

            arr_str[s1.charAt(i)]++;

            if (arr_str[s1.charAt(i)] == 1) {
                count++;
            }

                if (count == set.size()){

                    while (arr_str[s1.charAt(start)] > arr_pat[s1.charAt(start)]){
                        int str = arr_str[s1.charAt(start)];
                        int pat = arr_pat[s1.charAt(start)];

                        if (arr_str[s1.charAt(start)] > arr_pat[s1.charAt(start)]){
                            arr_str[s1.charAt(start)]--;
                        }
                        start++;
                    }

                    len_so_far = i - start + 1;

                    if (len_so_far < min_len){
                        min_len = len_so_far;
                        start_index = start;
                    }
                }
        }

        System.out.println(s1.substring(start_index, start_index+min_len));
    }


    static String findSubString(String str)
    {
        int n = str.length();

        // Count all distinct characters.
        int dist_count = 0;

        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (visited[str.charAt(i)] == false)
            {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }

        // Now follow the algorithm discussed in below
        // post. We basically maintain a window of characters
        // that contains all characters of given string.
        // https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;

        int count = 0;
        int[] curr_count =  new int[MAX_CHARS];
        for (int j=0; j<n; j++)
        {
            // Count occurrence of characters of string
            curr_count[str.charAt(j)]++;

            // If any distinct character matched,
            // then increment count
            if (curr_count[str.charAt(j)] == 1 )
                count++;

            // if all the characters are matched
            if (count == dist_count)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[str.charAt(start)] > 1)
                {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index+min_len);
    }
}
