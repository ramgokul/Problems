package problems.StringProblems.batch10;

public class MinReduceOpsReqdToConvertStrToPalin {
    /*
        Given a String find the minimum number of reduce operations required to convert a given string into a palindrome. In a reduce operation, we can change character to a immediate lower value. For example b can be covered to a.

        Examples :

        Input  :  abcd
        Output :  4
        We need to reduce c once
        and d three times.

        Input  : ccc
        Output : 0

        Solution:
        The idea is simple. We traverse string from left and compare characters of left half with their corresponding characters in right half. We add difference between to characters to result.
     */

    public static void main(String[] args) {
        String string = "ccc";
        int low = 0, high = string.length()-1;
        int count = 0;

        while (low < high){
            count += Math.abs(string.charAt(low) - string.charAt(high));
            low++;
            high--;
        }

        System.out.println("Min reduce operations : "+count);
    }
}
