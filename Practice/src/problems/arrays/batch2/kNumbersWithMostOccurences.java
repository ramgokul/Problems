package problems.arrays.batch2;

import java.util.*;
import java.util.stream.Collectors;

public class kNumbersWithMostOccurences {
    /*
        Given an array of n numbers and a positive integer k.
        The problem is to find k numbers with most occurrences, i.e., the top k numbers having the maximum frequency.
        If two numbers have same frequency then the larger number should be given preference.
        The numbers should be displayed in decreasing order of their frequencies.
        It is assumed that the array consists of k numbers with most occurrences.

        Examples:

        Input : arr[] = {3, 1, 4, 4, 5, 2, 6, 1},
                     k = 2
        Output : 4 1
        Frequency of 4 = 2
        Frequency of 1 = 2
        These two have the maximum frequency and
        4 is larger than 1.

        Input : arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9},
                    k = 4
        Output : 5 11 7 10
     */

    public static void main(String[] args) {
        int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k = 4;

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(k).forEach(System.out::println);

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(10);
//        list.add(20);
//
//        Set<Integer> set = list.stream().map(x->x*76).distinct().sorted().collect(Collectors.toSet());
//        System.out.println(set);

//        map.entrySet().stream()
//                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .limit(k).forEach(System.out::println);

//        Map<Integer, Integer> map2 = new TreeMap<>();
//
//        for (int s : map.keySet()){
//            map2.put(map.get(s),s);
//        }
//
//        System.out.println(map2);


//        System.out.println(map);
    }
}
