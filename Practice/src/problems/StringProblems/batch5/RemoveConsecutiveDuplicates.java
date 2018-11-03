package problems.StringProblems.batch5;

import java.util.HashSet;
import java.util.Set;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        remove_consecutive_vowels(s);

    }


    static void remove_consecitive_dup(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length() - 1));

        System.out.println(sb.toString());
    }

    static void remove_consecutive_vowels(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i=1; i<s.length(); i++){
            if (!isVowel(s.charAt(i-1)) || !isVowel(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    static boolean isVowel(char c){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        return set.contains(c);
    }
}