package problems.StringProblems.batch8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IgnoreAlternateOccurences {
    /*
        Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).

        Examples:

        Input : It is a long day Dear.
        Output : It sa longdy ear.
        Print first I and then ignore next i.
        Similarly print first space then
        ignore next space.


        Input : Geeks for geeks
        Output : Geks fore
     */

    public static void main(String[] args) {
//        String string = "It is a long day Dear.";
          String string = "Geeks for geeks";

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<string.length(); i++){
            char c = Character.toLowerCase(string.charAt(i));

            if (!map.containsKey(c)){
                sb.append(c);
                map.put(Character.toLowerCase(c), 1);
            }else {
                map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0)+1);

                if (map.get(c) % 2 == 1){
                    sb.append(c);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
