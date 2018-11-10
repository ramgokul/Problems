package problems.StringProblems.batch8;

public class CheckIfAllOccurencesOfCharacterAppearTogether {
    /*
        Given a string s and a character c, find if all occurrences of c appear together in s or not. If the character c does not appear in the string at all, the answer is true.

        Examples

        Input: s = "1110000323", c = '1'
        Output: Yes
        All occurrences of '1' appear together in
        "1110000323"

        Input: s  = "3231131", c = '1'
        Output: No
        All occurrences of 1 are not together

        Input: s  = "abcabc", c = 'c'
        Output: No
        All occurrences of 'c' are not together

        Input: s  = "ababcc", c = 'c'
        Output: Yes
        All occurrences of 'c' are together
     */

    public static void main(String[] args) {
        String s = "3231131";
        System.out.println(appear_together(s, '1'));
    }

    static boolean appear_together(String string, char c){
        int i = 0, j = string.length();
        boolean oneSeen = false;

        while (i<j){

            if (string.charAt(i) == c){

                if (oneSeen){
                    return false;
                }

                while (i<j && string.charAt(i) == c){
                    i++;
                }

                oneSeen = true;
            }else {
                i++;
            }
        }

        return true;
    }
}
