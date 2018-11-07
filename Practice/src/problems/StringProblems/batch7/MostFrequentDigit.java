package problems.StringProblems.batch7;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MostFrequentDigit {

    public static void main(String[] args) {
        int x = 1223377;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (x != 0){
            map.put(x%10, map.getOrDefault(x%10, 0)+1);
            x/=10;
        }

        System.out.println(map);

        List<Integer> list = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).map(y -> y.getKey()).collect(Collectors.toList());
        System.out.println(list);


        int key = list.get(0);
        int max_occurence = map.get(key);

        List<Integer> list2 = map.entrySet().stream().filter(x2 -> x2.getValue() == 2).map(x2 -> x2.getKey()).collect(Collectors.toList());

        System.out.println(Collections.max(list2));

    }
}
