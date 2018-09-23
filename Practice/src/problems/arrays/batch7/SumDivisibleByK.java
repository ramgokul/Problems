package problems.arrays.batch7;

import java.util.HashMap;
import java.util.Map;

public class SumDivisibleByK {
    /*
        Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

        Examples:

        Input: arr[] = {9, 7, 5, 3},
                   k = 6
        Output: True
        We can divide array into (9, 3) and
        (7, 5). Sum of both of these pairs
        is a multiple of 6.

        Input: arr[] = {92, 75, 65, 48, 45, 35},
                   k = 10
        Output: True
        We can divide array into (92, 48), (75, 65)
        and (45, 35). Sum of all these pairs is a
        multiple of 10.

        Input: arr[] = {91, 74, 66, 48}, k = 10
        Output: False
     */

    public static void main(String[] args) {
        int arr[] = {92, 75, 65, 48, 45, 35};
        int k = 10, rem = 0, count = 0;

        // An odd length array cannot be divided into pairs
        if (arr.length % 2 == 0){
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr){
            rem = n % 10;
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }

//        System.out.println(map);

        for (int n : arr){
            rem = n%10;

            if (2 * rem == k){

                if (map.get(rem) % 2 == 1){
                    System.out.println("No pairs found");
                    break;
                }
            }else if (rem == 0){

                if (map.get(rem) % 2 == 1){
                    System.out.println("No pairs found");
                    break;
                }
            }else {
                if (map.get(rem) != map.get(k-rem)){
                    System.out.println("No pairs found");
                    break;
                }
            }
        }

        System.out.println("Pair found");
    }
}
