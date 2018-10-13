package problems.arrays.batch6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayAccorAbsoluteDiff {

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 9, 2};
        int k =7;

        Map<Integer,Integer> map = new HashMap();

        for (int a : arr){
            map.put(a, Math.abs(k-a));
        }

        List<Integer> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(x -> x.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }

}
