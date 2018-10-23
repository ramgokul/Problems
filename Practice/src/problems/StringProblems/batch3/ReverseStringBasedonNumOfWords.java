package problems.StringProblems.batch3;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringBasedonNumOfWords {
    /*
        Given a string containing a number of words. If the count of words in string is even then reverse its even position’s words else reverse its odd position, push reversed words at the starting of a new string and append the remaining words as it is in order.

        Examples:

        Input:  Ashish Yadav Abhishek Rajput Sunil Pundir
        Output: ridnuP tupjaR vadaY Ashish Abhishek Sunil

        Input:  Ashish Yadav Abhishek Rajput Sunil Pundir Prem
        Output: merP linuS kehsihbA hsihsA Yadav Rajput Pundir
     */

    public static void main(String[] args) {
        String string = "Ashish Yadav Abhishek Rajput Sunil Pundir Prem";

        String[] words = string.split(" ");
        int word_length = words.length;
        boolean[] isReversed = new boolean[words.length];

        int index = -1;

        if (word_length % 2 == 0){
             index = 1;
        }else {
             index = 0;
        }

        for (int i=index; i<=word_length-1; i+=2){
            words[i] = reverse_word(words[i]);
            isReversed[i] = true;
        }

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(isReversed));

        int counter = -1;

        for (int j=0; j<words.length; j++){

            if (isReversed[j] == true){
                counter++;
                String temp = words[counter];
                words[counter] = words[j];
                words[j] = temp;
            }
        }

        System.out.println(Arrays.toString(words));

    }

    static String reverse_word(String string){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb =  new StringBuilder();

        for (int i=0; i<string.length(); i++){
            stack.push(string.charAt(i));
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
