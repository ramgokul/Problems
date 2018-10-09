package problems.StringProblems.batch0;

import java.util.Arrays;

public class MoveSpacesToBeginningOfString {

    public static void main(String[] args) {
        String str = "geeks for geeks";
        int counter = -1;

        char[] indChars = str.toCharArray();

        for (int i=0; i<str.length(); i++){
            char element = str.charAt(i);

            if (element == ' '){
                counter++;
                char temp = indChars[counter];
                indChars[counter] = indChars[i];
                indChars[i] = temp;
            }

        }

        System.out.println(Arrays.toString(indChars));
    }
}
