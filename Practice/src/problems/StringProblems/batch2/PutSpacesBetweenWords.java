package problems.StringProblems.batch2;

public class PutSpacesBetweenWords {

    /*
        You are given an array of characters which is basically a sentence. However there is no space between different words and the first letter of every word is in uppercase. You need to print this sentence after following amendments:
        (i) Put a single space between these words.
        (ii) Convert the uppercase letters to lowercase.

        Examples:

        Input : BruceWayneIsBatman
        Output : bruce wayne is batman

        Input :  You
        Output :  you
     */

    public static void main(String[] args) {
        String s = "BruceWayneIsBatman";
        char[] c = s.toCharArray();

        for (char x : c){
            if (Character.isUpperCase(x)){
                System.out.print(" ");
            }
            System.out.print(Character.toLowerCase(x));
        }
    }
}
