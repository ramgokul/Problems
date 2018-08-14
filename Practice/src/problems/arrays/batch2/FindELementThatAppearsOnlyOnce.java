package problems.arrays.batch2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindELementThatAppearsOnlyOnce {

    public static void main(String[] args) {
        int ar[] = {7, 3, 5, 4, 5, 3, 4};

//        int res = ar[0];
//
//        for (int i=1; i<ar.length; i++){
//            res = res ^ ar[i];
//        }

        appearsOnlyOnce(ar);

//        System.out.println("Element that appears only once : "+res);
    }

    static void appearsOnlyOnce(int[] ar){
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int n : ar){
            map2.put(n, map2.getOrDefault(n, 0)+1);
        }

//        System.out.println(map2);
//        Map<Integer, Integer> map3 =  map2.entrySet().stream().filter(map -> map.getValue() == 1).collect(Collectors.toMap(map -> map.getValue(), map -> map.getKey() ));
//        System.out.println("Result : "+map3.get(1));

        map2.entrySet().stream().filter(map -> map.getValue() == 1).forEach(System.out :: println);
    }
}
