package problems.StringProblems.batch1;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharInString {

    public static void main(String[] args) {
        maxOccuringChar("Rishi");
    }

    public static void maxOccuringChar(String s){
        char c='a';
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();

        char[] c1 = s.toCharArray();

        for (char s2 : c1){
            map.put(s2, map.getOrDefault(s2, 0)+1);

            if (map.get(s2) > max){
                max = map.get(s2);
                c = s2;
            }
        }

        System.out.println("Max occuring character : "+c);
    }
}
