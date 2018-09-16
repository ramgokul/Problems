package problems.StringProblems.batch0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWordInASequence {

    /*
        Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.(Considering no two words are the second most repeated, there will be always a single word).

        Examples:

        Input : {"aaa", "bbb", "ccc", "bbb",
                 "aaa", "aaa"}
        Output : bbb

        Input : {"geeks", "for", "geeks", "for",
                  "geeks", "aaa"}
        Output : for
     */

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc", "bbb",
                "aaa", "aaa"};

        Map<String, Integer> map = new HashMap<>();

        for (String a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        System.out.println(map);

        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> val : map.entrySet()){

            if (val.getValue() > first_max){
                second_max = first_max;
                first_max = val.getValue();
            }else if (val.getValue() > second_max){
                second_max = val.getValue();
            }
        }

        System.out.println("Second max : "+second_max);

        for (String s : map.keySet()){
            if (map.get(s) == second_max){
                System.out.println("Second most repeated word : "+s);
                return;
            }
        }
    }
}
