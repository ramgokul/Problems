package problems.StringProblems.batch5;

import java.util.HashMap;
import java.util.Map;

public class ChangeStringtoNewCharset {

    /*
        Given a 26 letter character set, which is equivalent to character set of English alphabet i.e. (abcd….xyz) and act as a relation. We are also given several sentences and we have to translate them with the help of given new character set.

        Examples:

        New character set : qwertyuiopasdfghjklzxcvbnm
        Input : "utta"
        Output : geek

        Input : "egrt"
        Output : code
     */

    public static void main(String[] args) {

        String s = "qwertyuiopasdfghjklzxcvbnm", input = "utta";
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i) - 'a', 'a'+i);
        }

        System.out.println(map);

        char c = (char) 103;
        System.out.println(c);

        for (int j=0; j<input.length(); j++){
            int is = map.get(input.charAt(j) - 'a');
            char c2 = (char) is;
            System.out.print(c2);
        }
    }

}
