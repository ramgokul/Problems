package problems.arrays.batch7;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class AplusBequalsCplusD {
    /*
        Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) such that a+b = c+d, and a, b, c and d are distinct elements. If there are multiple answers, then print any of them.

        Example:

        Input:   {3, 4, 7, 1, 2, 9, 8}
        Output:  (3, 8) and (4, 7)
        Explanation: 3+8 = 4+7

        Input:   {3, 4, 7, 1, 12, 9};
        Output:  (4, 12) and (7, 9)
        Explanation: 4+12 = 7+9

        Input:  {65, 30, 7, 90, 1, 9, 8};
        Output:  No pairs found
     */

    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 1, 2, 9, 8};
        Map<Integer, Pair> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){

                int sum = nums[i] + nums[j];

                if (!map.containsKey(sum)){
                    map.put(sum, new Pair(i, j));
                }else {
                    Pair<Integer,Integer> p = map.get(sum);
                    int one = p.getKey();
                    int two = p.getValue();
                    System.out.println("Pairs --> ("+nums[i]+","+nums[j]+")"+" and ("+nums[one]+","+nums[two]+")");
                }
            }
        }
    }
}
