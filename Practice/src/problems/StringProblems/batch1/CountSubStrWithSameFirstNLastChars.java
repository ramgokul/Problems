package problems.StringProblems.batch1;

import java.util.Arrays;

public class CountSubStrWithSameFirstNLastChars {
    static final int MAX_CHAR = 26;


    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSubstringWithEqualEnds(s));
    }


    static int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();

        // Calculating frequency of each character
        // in the string.
        int[] count =  new int[MAX_CHAR];
        for (int i = 0; i < n; i++)
//            int v2 = s.charAt(i) - 'a';
            count[s.charAt(i)-'a']++;

        System.out.println(Arrays.toString(count));

        // Computing result using counts
        for (int i = 0; i < MAX_CHAR; i++)
            result += (count[i] * (count[i] + 1) / 2);

        return result;
    }
}
