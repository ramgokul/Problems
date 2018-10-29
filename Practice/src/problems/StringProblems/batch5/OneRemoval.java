package problems.StringProblems.batch5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneRemoval {
    /*
        Given a string which contains lower alphabetic characters, we need to remove at most one character from this string in such a way that frequency of each distinct character becomes same in the string.
        Examples:

        Input  : str = “xyyz”
        Output : Yes
        We can remove character ’y’ from above
        string to make the frequency of each
        character same.

        Input : str = “xyyzz”
        Output : Yes
        We can remove character ‘x’ from above
        string to make the frequency of each
        character same.

        Input : str = “xxxxyyzz”
        Output : No
        It is not possible to make frequency of
        each character same just by removing at
        most one character from above string.
     */

    public static void main(String[] args) {
        String s = "xxxxyyzz";
        removal_one(s);
    }

    static boolean removal_one(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

//        System.out.println("Is same : "+is_same(map));

        for (Character s1 : map.keySet()){
            int occ = map.get(s1);
            map.put(s1, occ-1);

            if (is_same(map)){
                return true;
            }

            map.put(s1, occ++);
        }

        return false;
    }

    static boolean is_same(Map<Character, Integer> m){

//        if (m.keySet().size() == 1){
//            return false;
//        }

        int firstVal = 0;

        for (Map.Entry<Character, Integer> data : m.entrySet()){
            char c1 = data.getKey();
            int occurence = data.getValue();

            if (m.get(c1) > 0){
                 firstVal = m.get(c1);
                 break;
            }
        }

        for (Map.Entry<Character, Integer> data : m.entrySet()) {
            char c1 = data.getKey();
            int occurence = data.getValue();

            if (occurence>0 && m.get(c1) != firstVal){
                return false;
            }
        }

        return true;
    }
}
