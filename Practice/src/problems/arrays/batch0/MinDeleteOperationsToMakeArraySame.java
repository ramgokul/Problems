package problems.arrays.batch0;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MinDeleteOperationsToMakeArraySame {

    /*
        Given an array of n elements such that elements may repeat. We can delete any number of elements from array. The task is to find minimum number of elements to be deleted from array to make it equal.

        Examples:

        Input  : arr[] = {4, 3, 4, 4, 2, 4}
        Output : 2
        After deleting 2 and 3 from array, array becomes
        arr[] = {4, 4, 4, 4}

        Input : arr[] = {1, 2, 3, 4, 5}
        Output: 4
        We can delete any four elements from array.
     */

    public static void main(String[] args) {
        Map<Integer, Integer> maps = new TreeMap<>();
        int[] arr = {4, 3, 4, 4, 2, 4};
        int n = arr.length;

        for (int x : arr){
            maps.put(x, maps.getOrDefault(x, 0)+1);
        }

        Map<Integer, Integer> m2 = maps.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        int frequency = 0;

        for (Integer s : m2.values()){
            frequency = s;
        }

        int min_delete_operations = n - frequency;

        System.out.println("Min delete operations : "+min_delete_operations);

    }
}
