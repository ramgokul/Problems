package problems.arrays.batch8;

import java.util.LinkedHashMap;
import java.util.Map;

public class GroupMultiOccurence {

    /*
        Given an unsorted array with repetitions, the task is to group multiple occurrence of individual elements. The grouping should happen in a way that the order of first occurrences of all elements is maintained.

        Examples:

        Input: arr[] = {5, 3, 5, 1, 3, 3}
        Output:        {5, 5, 3, 3, 3, 1}

        Input: arr[] = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4}
        Output:        {4, 4, 4, 6, 6, 9, 9, 2, 3, 10}
     */

    public static void main(String[] args) {
        Map<Integer, Integer> lmap = new LinkedHashMap<>();

        int arr[] = {5, 3, 5, 1, 3, 3};
        for (int n :  arr){
            lmap.put(n, lmap.getOrDefault(n, 0)+1);
        }

        System.out.println(lmap);

        for (int s : lmap.keySet()){
            int count = lmap.get(s);

            while (count > 0){
                System.out.print(s + " ");
                count--;
            }
        }

    }
}
