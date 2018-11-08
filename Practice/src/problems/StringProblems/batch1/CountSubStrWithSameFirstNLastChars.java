package problems.StringProblems.batch1;

import java.util.Arrays;

public class CountSubStrWithSameFirstNLastChars {
    /*
        We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.

        Examples :

        Input  : S = "abcab"
        Output : 7
        There are 15 substrings of "abcab"
        a, ab, abc, abca, abcab, b, bc, bca
        bcab, c, ca, cab, a, ab, b
        Out of the above substrings, there
        are 7 substrings : a, abca, b, bcab,
        c, a and b.

        Input  : S = "aba"
        Output : 4
        The substrings are a, b, a and aba

        Method 3 (Best approach) : Now if we carefully observe then we can realize that the answer just depends on frequencies of characters in the original string. For example in string abcab, frequency of ‘a’ is 2 and substrings contributing to answer are a, abca and a respectively, a total of 3, which is calculated by (frequency of ‘a’+1)C2.
     */
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
