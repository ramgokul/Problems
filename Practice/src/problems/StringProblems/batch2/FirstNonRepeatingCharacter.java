package problems.StringProblems.batch2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String string = "GeeksforGeeks";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : string.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);

        List<Character> list = map.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).collect(Collectors.toList());

        System.out.println("First non-repeating character : " +list.get(2));
    }
}
