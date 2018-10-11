package problems.StringProblems.batch2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnagramSubstringSearch {

    public static void main(String[] args) {
        String txt = "BACDGABCDA",  pat = "ABCD";

        int M = pat.length();
        int N = txt.length();

        Map<Character, Integer> map_pat = new HashMap<>();
        Map<Character, Integer> map_txt = new HashMap<>();

        Set<Character> set_pat = new HashSet<>();
        Set<Character> set_txt = new HashSet<>();

        for (int i=0; i<M; i++){
            map_pat.put(pat.charAt(i), map_pat.getOrDefault(pat.charAt(i), 0)+1);
            map_txt.put(txt.charAt(i), map_txt.getOrDefault(txt.charAt(i), 0)+1);
        }

//        System.out.println("Map_Pat : "+map_pat);
//        System.out.println("Map_Txt : "+map_txt);
        int i = 0;

        for (i=M; i<N; i++){
             set_pat = map_pat.keySet();
             set_txt = map_txt.keySet();

            if (set_pat.containsAll(set_txt)){
                System.out.println("Found at index : "+(i-M));
            }

            map_txt.put(txt.charAt(i), map_txt.getOrDefault(txt.charAt(i), 0)+1);
            map_txt.remove(txt.charAt(i-M));
        }

        if (set_pat.containsAll(set_txt)){
            System.out.println("Found at index : "+(i-M));
        }
    }
}
