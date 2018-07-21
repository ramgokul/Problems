package problems.StringProblems.batch0;

import java.util.Arrays;

public class ReverseStringWOAffectingSplChars {

    public static void main(String[] args) {
        reverseString("Ab,c,de!$");
    }

    public static void reverseString(String string){
        char[] chars = string.toCharArray();
        int left = 0, right = chars.length-1;
        char temp;

        while (left < right){
            if (!Character.isAlphabetic(chars[left])){
                left++;
            }else if (!Character.isAlphabetic(chars[right])){
                right--;
            }else {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(chars));
    }
}
