package problems.arrays.batch6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Top3RepeatedElements {

    /*
        Given an array of size N with repeated numbers, You Have to Find the top three repeated numbers.
        Note : If Number comes same number of times then our output is one who comes first in array
        Examples:

        Input : arr[] = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
        Output : Three largest elements are 3 16 15
        Explanation :Here, 3 comes 4 times, 16 comes 3 times, 15 comes 3 times.

        Input : arr[] = {2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5}
        Output : Three largest elements are 2 3 5
     */

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};

        Map<Integer, Integer> hmap = new HashMap<>();

        for (int a : arr){
            hmap.put(a, hmap.getOrDefault(a, 0)+1);
        }

        Map<Integer,Integer> m2 =  hmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(m2);
    }
}
