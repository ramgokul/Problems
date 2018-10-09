package problems.StringProblems.batch2;

import java.util.*;

public class PrintAllAnagramsTogether {

    public static void main(String[] args) {

        String wordArr[] = {"cat", "dog", "tac", "god", "act", "gdo"};
        Map<Integer, List<String>> map = new HashMap<>();

        for (String word : wordArr){

            char[] c = word.toCharArray();
            Arrays.sort(c);

            String sorted_word = new String(c);

            int hash_code = sorted_word.hashCode();

            if (!map.containsKey(hash_code)){
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(hash_code, words);
            }else {
                List<String> existing_words = map.get(hash_code);
                existing_words.add(word);
                map.put(hash_code, existing_words);
            }
        }

//        System.out.println(map);

        for (List<String> l : map.values()){

            for (int i=0; i<l.size(); i++){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
}
