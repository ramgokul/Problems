package problems.arrays.batch11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DiffBwHighestNLeastFrq {

    /*
        Given an array, find the difference between highest occurrence and least occurrence of any number in an array

        Examples:

        Input  : arr[] = [7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5]
        Output : 2
        Lowest occurring element (5) occurs once.
        Highest occurring element (1 or 7) occurs 3 times

        Input  : arr[] = [1, 1, 1, 3, 3, 3]
        Output : 0
     */

    public static void main(String[] args) {
//        int arr[] = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        int arr[] = {1, 1, 1, 3, 3, 3};
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        System.out.println(map);

        List<Integer> list1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(x -> x.getValue()).collect(Collectors.toList());
        List<Integer> list2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println("Difference : "+ (list2.get(0) - list1.get(0)));
    }
}
