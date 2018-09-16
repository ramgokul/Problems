package problems.StringProblems.batch0;

import java.util.*;

public class GroupWordsWithSameSetOfChars {

    /*
        Given a list of words with lower cases. Implement a function to find all Words that have the same unique character set .

        Example:

        Input: words[] = { "may", "student", "students", "dog",
                         "studentssess", "god", "cat", "act",
                         "tab", "bat", "flow", "wolf", "lambs",
                         "amy", "yam", "balms", "looped",
                         "poodle"};
        Output :
        looped, poodle,
        lambs, balms,
        flow, wolf,
        tab, bat,
        may, amy, yam,
        student, students, studentssess,
        dog, god,
        cat, act,

        All words with same set of characters are printed
        together in a line.
     */

    public static void main(String[] args) {
        String words[] = { "may", "student", "students", "dog",
                "studentssess", "god", "cat", "act",
                "tab", "bat", "flow", "wolf", "lambs",
                "amy", "yam", "balms", "looped",
                "poodle"};

        words_with_same_char(words);
    }

    static String getKey(String s){

        boolean[] visited = new boolean[26];
        Arrays.fill(visited, false);

        for (int i=0; i<s.length(); i++){
            visited[s.charAt(i) - 'a'] = true;
        }

        String key = "";
        for (int j = 0; j<26; j++){
            if (visited[j]){
                key += (char)('a' + j);
            }
        }
//        System.out.println("Key : "+key);
        return key;
    }

    static void words_with_same_char(String[] words){
        Map<String, ArrayList<Integer>> m2 = new HashMap<>();
        String key = "";

        for (int i=0; i<words.length; i++){
            key = getKey(words[i]);

            if (!m2.containsKey(key)){
                ArrayList<Integer> a1 = new ArrayList<>();
                a1.add(i);

                m2.put(key, a1);
            }else {
                ArrayList<Integer> a2 = m2.get(key);
                a2.add(i);

                m2.put(key, a2);
            }
        }

        for (Map.Entry<String, ArrayList<Integer>> val : m2.entrySet()){
            ArrayList<Integer> result = val.getValue();

            for (Integer v : result){
                System.out.print(words[v] + " ");
            }
            System.out.println();
        }
    }
}
