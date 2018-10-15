package problems.arrays.batch10;

import java.util.Map;
import java.util.TreeMap;

public class RankElementsInArray {

    /*
        Given an array of N integers with duplicates allowed. All elements are ranked from 1 to N if they are distinct. If there are say x repeated elements of a particular value then each element should be assigned a rank equal to the arithmetic mean of x consecutive ranks.

        Examples:

        Input : 20 30 10
        Output : 2.0 3.0 1.0

        Input : 10 12 15 12 10 25 12
        Output : 1.5, 4.0, 6.0, 4.0, 1.5, 7.0, 4.0
        10 is the smallest and there are two 10s so
        take the average of two consecutive ranks
        1 and 2 i.e. 1.5 . Next smallest element is 12.
        Since, two elements are already ranked, the
        next rank that can be given is 3. However, there
        are three 12's so the rank of 2 is (3+4+5) / 3 = 4.
        Next smallest element is 15. There is only one 15
        so 15 gets a rank of 6 since 5 elements are ranked.
        Next element is 25 and it gets a rank of 7.

        Input : 1, 2, 5, 2, 1, 60, 3
        Output : 1.5, 3.5, 6.0, 3.5, 1.5, 7.0, 5.0
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 1, 25, 2};
        Map<Integer, Double> map = new TreeMap<>();

        for (int x : arr){
            map.put(x, map.getOrDefault(x, 0.0)+1);
        }

        System.out.println(map);

        double i = 1.0;


        for (Map.Entry<Integer,Double> data : map.entrySet()){
            int sum = 0;

            int key = data.getKey();
            double occurence = data.getValue();
            double occurence_counter = occurence;

            while (occurence_counter > 0){
                sum += occurence_counter;
                occurence_counter--;
            }
            map.put(key, sum/occurence);

        }
    }
}
