package problems.StringProblems.batch8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternateVowelNConsonant {

    /*
        Given a string, rearrange characters of the given string such that the vowels and consonants occupy alternate position. If string can not be rearranged in desired way, print “no such string”. The order of vowels with respect to each other and the order of consonants with respect to each other should be maintained.

        If more than one required strings can be formed, print the lexicographically smaller.

        Examples:

        Input : geeks
        Output : gekes

        Input : onse
        Output : nose
        There are two possible outcomes
        "nose" and "ones".  Since "nose"
        is lexicographically smaller, we
        print it.
     */

    public static void main(String[] args) {
        String str = "onse";
        String pattern = "[^aeiou]";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        int consonant_cnt = 0;

        while (m.find()){
            consonant_cnt++;
        }
        int vowel_cnt = Math.abs(str.length() - consonant_cnt);

        System.out.println("Number of vowels : "+vowel_cnt);
        System.out.println("Number of consonant : "+consonant_cnt);

        if (Math.abs(vowel_cnt - consonant_cnt) > 1){
            System.out.println("No alternate pair can be formed");
            return;
        }

        char[] arr = str.toCharArray();
        int index = -1;

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if (vowel_cnt > consonant_cnt || vowel_cnt == consonant_cnt){
            for (int i=0; i<arr.length; i++){

                if (set.contains(arr[i])){
                    index++;
                    char temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
        }else if (vowel_cnt < consonant_cnt) {
            for (int i=0; i<arr.length; i++){

                if (!set.contains(arr[i])){
                    index++;
                    char temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        int x = 0, y =arr.length-1;

        while (x < y){
            System.out.print(arr[x]);
            System.out.print(arr[y]);
            x++;y--;
        }

        if (arr.length % 2 != 0){
            System.out.print(arr[x]);
        }

        System.out.println();


    }
}
