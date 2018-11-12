package problems.StringProblems.batch10;

public class MinCharsToBRemovedToMakeStringAlternate {

    /*
        Given a binary string, the task is to find minimum number of characters to be removed from it so that it becomes alternate. A binary string is alternate if there are no two consecutive 0s or 1s.

        Examples :

        Input  : s = "000111"
        Output : 4
        We need to delete two 0s and
        two 1s to make string alternate.

        Input  : s = "0000"
        Output : 3
        We need to delete three characters
        to make it alternate.

        Input  :  s = "11111"
        Output :  4

        Input  : s = "01010101"
        Output : 0

        Input  : s = "101010"
        Output : 0

        Solution:
        We traverse string from left to right and compare current character with next character.

        If current and next are different then no need to perform deletion.
        If current and next are same, we need to perform one delete operation to make them alternate.
     */

    public static void main(String[] args) {
        String s = "101010";
        int count = 0;

        for (int i=0; i<s.length()-1; i++){

            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            }

        }

        System.out.println("Num of chars to be removed : "+count);
    }
}
