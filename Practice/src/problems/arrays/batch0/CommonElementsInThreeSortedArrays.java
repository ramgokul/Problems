package problems.arrays.batch0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonElementsInThreeSortedArrays {

     /*
            Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

            Examples:

            ar1[] = {1, 5, 10, 20, 40, 80}
            ar2[] = {6, 7, 20, 80, 100}
            ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
            Output: 20, 80

            ar1[] = {1, 5, 5}
            ar2[] = {3, 4, 5, 5, 10}
            ar3[] = {5, 5, 10, 20}
            Output: 5, 5
       */

    public static void main(String[] args) {

        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        int i=0,j=0,k=0;

        while (i<ar1.length && j<ar2.length && k<ar3.length){

            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]){
                System.out.print(""+ar1[i] + " ");
                i++; j++; k++;
            }else if (ar1[i] < ar2[j]){
                i++;
            }else if (ar2[j] < ar3[k]){
                j++;
            }else {
                k++;
            }
        }

    }

    static void commonELementsIn3Arrays(int[] nums1, int[] nums2, int[] nums3){
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums1){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (int n :nums2){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (int n :nums3){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List list = map.entrySet().stream().filter(x->x.getValue()==3).map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }
}
