package problems.StringProblems.batch7;

public class CountCharsInSamePositionAsEngAlphabets {
    /*
        Given a string of lower and uppercase characters, the task is to find that how many characters are at same position as in English alphabet.

        Examples:

        Input:  ABcED
        Output :  3
        First three characters are at same position
        as in English alphabets.

        Input:  geeksforgeeks
        Output :  1
        Only 'f' is at same position as in English
        alphabet

        Input :  alphabetical
        Output :  3
     */

    public static void main(String[] args) {
        String string = "alphabetical";
        int result = 0;

        for (int i=0; i<string.length(); i++){
            if (i == string.charAt(i) - 'a' || i == string.charAt(i) - 'A'){
                result++;
            }
        }

        System.out.println("Chars in same position : "+result);
    }
}
