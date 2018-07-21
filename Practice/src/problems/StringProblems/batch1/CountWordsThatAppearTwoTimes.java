package problems.StringProblems.batch1;

import java.util.HashMap;
import java.util.Map;

public class CountWordsThatAppearTwoTimes {

    public static void main(String[] args) {
        String[] str = {"hate", "love", "peace", "love",
                "peace", "hate", "love", "peace",
                "love", "peace"};

        returnCount(str);

    }

    public static void returnCount(String[] str){
        Map<String,Integer> map = new HashMap<>();

        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (String v : map.keySet()){
            if (map.get(v) == 2){
                System.out.println("Word that appears twice : "+v);
            }
        }
    }
}
