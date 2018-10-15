package problems.arrays.batch10;

import com.sun.deploy.util.StringUtils;
import com.sun.deploy.util.SystemUtils;
import com.sun.tools.classfile.ConstantPool;

import java.util.*;
import java.util.stream.Collectors;

public class SortElementsByFrquency {

    /*
        Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

        Examples:

        Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
        Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

        Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
        Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
     */

    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
        method1(arr);
    }

    static void method1(int[] arr){
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

//        System.out.println(map);

         Map<Integer, Integer> map2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap<Integer, Integer>::new));

        System.out.println(map2);
        int index = 0;

        for (Map.Entry<Integer, Integer> data : map2.entrySet()){
            int key = data.getKey();
            int occurence = data.getValue();

            while (occurence > 0){
                arr[index++] = key;
                occurence--;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
