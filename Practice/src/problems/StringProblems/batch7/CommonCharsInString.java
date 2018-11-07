package problems.StringProblems.batch7;

import java.util.*;
import java.util.stream.Collectors;

public class CommonCharsInString {

    public static void main(String[] args) {
        String str[] = { "geeksforgeeks",
                "gemkstones",
                "acknowledges",
                "aguelikes" };


        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();

        for (String s : str){

            char[] c = s.toCharArray();

            for (char x : c){
                set.add(x);
            }

            for (char y : set){
                map.put(y, map.getOrDefault(y, 0)+1);
            }
            set.clear();
        }

        System.out.println(map);

        int n = str.length;

        Set<Character> set2 = map.entrySet().stream().filter(x->x.getValue()==n).map(x->x.getKey()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
