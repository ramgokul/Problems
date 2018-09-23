package problems.arrays.batch7;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DivisibleByAnother {

    /*
        Given an array of length N that contains only integers, the task is to print the special numbers of array. A number in this array is called Special number if it is divisible by at least one other number in the array.

        Examples :

        Input : 1 2 3
        Output : 2 3
        Explanation : both 2 and 3 are divisible by 1.

        Input : 2 3 4 6 8 9
        Output : 4 6 8 9
        Explanation : 2 and 3 are not divisible by any other element. Rest of the element are divisible by at-least 1 element. 6 is divisible by both 2 and 3, 4 divisible by 2, 8 divisible by 2 and 4 both, 9 divisible by 3.

        Input : 3 5 7 11
        Output :
        Explanation : all elements are relatively prime so no special number.
     */

    public static void main(String[] args) {
        int[] arr = {2, 3, 8,
                6, 9, 10};

        Set<Integer> set = new HashSet<>();
        int max_ele = Integer.MIN_VALUE;
        for (int n : arr){
            set.add(n);
            max_ele = Math.max(max_ele, n);
        }
        System.out.println(set);
        System.out.println(max_ele);

        for (int n : arr){

            if (n != 0){

                for (int j=n*2; j<=max_ele; j+=n){

                    if (set.contains(j)){
                        System.out.println("Found : "+j);
                    }
                }
            }
        }
    }
}
