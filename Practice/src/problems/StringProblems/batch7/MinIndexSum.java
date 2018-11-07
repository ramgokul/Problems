package problems.StringProblems.batch7;

import java.util.*;

public class MinIndexSum {

    /*
        Ram and Shyam want to choose a website to learn programming and they both have a list of favorite websites represented by strings.
        You need to help them find out their common interest with the least index sum. If there is a choice tie between answers, print all of them with no order requirement. Assume there always exists an answer.

        Examples:

        Input : ["GeeksforGeeks", "Udemy", "Coursera", "edX"]
                ["Codecademy", "Khan Academy", "GeeksforGeeks"]
        Output : "GeeksforGeeks"
        Explanation : GeeksforGeeks is the only common website
                      in two lists

        Input : ["Udemy", "GeeksforGeeks", "Coursera", "edX"]
                ["GeeksforGeeks", "Udemy", "Khan Academy", "Udacity"]
        Output : "GeeksforGeeks" "Udemy"
        Explanation : There are two common websites and index sum
                      of both is same.
     */

    public static void main(String[] args) {
        String[] arr1 = {"Udemy", "GeeksforGeeks", "Coursera", "edX"};
        String[] arr2 = {"GeeksforGeeks", "Udemy", "Khan Academy", "Udacity"};

        Map<String, Integer> map = new HashMap<>();
        Set<String> result = new HashSet<>();

        for (int j=0; j<arr1.length; j++){
            map.put(arr1[j], j);
        }

        int min_sum = Integer.MAX_VALUE;

        for (int i=0; i<arr2.length; i++){

            if (map.containsKey(arr2[i])){
                int sum = i + map.get(arr2[i]);

                if (sum < min_sum){
                    min_sum = sum;
                    result.clear();
                    result.add(arr2[i]);
                }else if (min_sum == sum){
                    result.add(arr2[i]);
                }
            }
        }

        System.out.println("Final Result : "+result);
    }
}
