package problems.arrays.batch9;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInWindowK {

    /*
        Given an array of size n and an integer k, return the of count of distinct numbers in all windows of size k.
        Example:

        Input:  arr[] = {1, 2, 1, 3, 4, 2, 3};
                    k = 4
        Output:
        3
        4
        4
        3

        Explanation:
        First window is {1, 2, 1, 3}, count of distinct numbers is 3
        Second window is {2, 1, 3, 4} count of distinct numbers is 4
        Third window is {1, 3, 4, 2} count of distinct numbers is 4
        Fourth window is {3, 4, 2, 3} count of distinct numbers is 3

        An Efficient Solution is to use the count of the previous window while sliding the window. The idea is to create a hash map that stores elements of the current window. When we slide the window, we remove an element from the hash and add an element. We also keep track of distinct elements. Below is the algorithm.
     */

    public static void main(String[] args) {
        int arr[] =  {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        int distinct_count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k; i++){

            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
                distinct_count++;
            }else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }

        }

        System.out.println("Distinct count : "+distinct_count);

        for (int i=k; i<arr.length; i++){

            System.out.println(arr[i-k]);

            if (map.get(arr[i-k]) == 1){
                map.remove(arr[i-k]);
                distinct_count--;
            }else {
                int count = map.get(arr[i-k]);
                map.put(arr[i-k], count-1);
            }

            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
                distinct_count++;
            }else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }

            System.out.println("Distinct count : "+distinct_count);
        }
    }
}
