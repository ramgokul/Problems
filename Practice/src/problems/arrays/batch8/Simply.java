package problems.arrays.batch8;


import java.util.HashMap;
import java.util.Map;

public class Simply {

    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 5);
        m.put(2, 10);
        m.put(3, 15);

        for (Map.Entry<Integer, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + "-"+ e.getValue());
        }
    }
}
