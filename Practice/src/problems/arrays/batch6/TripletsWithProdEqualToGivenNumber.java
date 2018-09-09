package problems.arrays.batch6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TripletsWithProdEqualToGivenNumber {

    /*
        Given an array of distinct integers(considering only positive numbers) and a number ‘m’, find the number of triplets with product equal to ‘m’.

        Examples:

        Input : arr[] = { 1, 4, 6, 2, 3, 8}
                    m = 24
        Output : 3
        {1, 4, 6} {1, 3, 8} {4, 2, 3}

        Input : arr[] = { 0, 4, 6, 2, 3, 8}
                    m = 18
        Output : 0
     */

    static void count_triplest(int[] arr, int m){
        Map<Integer, Integer> hmap = new HashMap<>();
        int check=0;

        for (int i=0; i<arr.length; i++){
            hmap.put(arr[i], i);
        }

        System.out.println(hmap);

        for (int i=0; i< arr.length-1; i++){

            if ((arr[i] * arr[i+1]) != 0 && (arr[i] * arr[i+1]) <= m && (m % (arr[i] * arr[i+1])) == 0){
                 check = m / (arr[i] * arr[i+1]);
            }

            System.out.println("hmap.get(check) : "+hmap.get(check));
            System.out.println("check != arr[i] : "+(check != arr[i]));
            System.out.println("check != arr[i+1] : "+(check != arr[i+1]));
            System.out.println("hmap.get(check) > i : "+ (hmap.get(check) > i));
            System.out.println("hmap.get(check) > i+1 : "+ (hmap.get(check) > (i+1)));

            if (hmap.containsKey(check) && check != arr[i] && check != arr[i+1] &&
                    hmap.get(check) > i && hmap.get(check) > (i+1)){
                System.out.println("Triplets are "+arr[i]+ ","+arr[i+1]+","+check);
            }

        }
    }

    static void count_triplets(int[] arr, int m){
        Set<Integer> set = new HashSet<>();
        int prod = 0;
        int check = 0;

        for (int i=0; i < arr.length-1; i++){
            prod = arr[i] * arr[i+1];

            if (prod != 0 && prod <= m && (m % prod)==0){
                check = m / prod;


                if (check != arr[i] && check != arr[i+1]){
                    if (!set.contains(check)){
                        System.out.println("Triplets are "+arr[i]+ ","+arr[i+1]+","+check);
                    }else {
                        set.add(check);
                    }
                }


            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 2, 3, 8 };
        int m = 24;

        count_triplets(arr, m);
    }
}
