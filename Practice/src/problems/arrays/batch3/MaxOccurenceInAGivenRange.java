package problems.arrays.batch3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurenceInAGivenRange {

    public static void main(String[] args) {
        int arr[] = {-5, -5, 2, 2, 2, 2, 3, 7, 7, 7};
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for (int i=4; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        map2 = map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (Integer m :map2.keySet()){
            System.out.println(""+m+ " is repeated "+map2.get(m)+ " times");
        }
    }
}
