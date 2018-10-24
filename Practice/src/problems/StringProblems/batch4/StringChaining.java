package problems.StringProblems.batch4;

import java.util.HashMap;
import java.util.Map;

public class StringChaining {


    public static void main(String[] args) {
        String arr[] = {"ijk", "kji", "abc", "cba"};
        Map<Character, Integer> word_prefix = new HashMap<>();
        Map<Character, Integer> word_suffix = new HashMap<>();

        for (String word : arr){
            char prefix = word.charAt(0);
            char suffix = word.charAt(word.length()-1);

            word_prefix.put(prefix, word_prefix.getOrDefault(prefix, 0)+1);
            word_suffix.put(suffix, word_suffix.getOrDefault(suffix, 0)+1);
        }

        System.out.println(word_suffix);
        System.out.println(word_prefix);

        for (Character c : word_suffix.keySet()){
            if (!word_suffix.containsKey(c)){
                System.out.println("Chaining is not possible");
                break;
            }
        }

        System.out.println("Chaining is possible");
    }
}
