package problems.StringProblems.batch6;

public class PutSpacesBwWordsStartingWithCapLetters {
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
        String string = "You";

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(string.charAt(0)).toLowerCase());

        for (int i=1; i<string.length(); i++){

            if (Character.isUpperCase(string.charAt(i))){
                sb.append(" ");
                sb.append(String.valueOf(string.charAt(i)).toLowerCase());
            }else {
                sb.append(string.charAt(i));
            }

        }

        System.out.println(sb.toString());
    }
}
