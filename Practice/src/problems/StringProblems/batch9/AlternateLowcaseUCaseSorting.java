package problems.StringProblems.batch9;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternateLowcaseUCaseSorting {
    /*
        Given a string containing lowercase and uppercase letters.sort it in such a manner such that the uppercase and lowercase letter comes in an alternate manner but in sorted way.

        Examples:

        Input : bAwutndekWEdkd
        Output :AbEdWddekkntuw
        Explanation:
        Here we can see that letter ‘A’, ’E’, ’W’ are sorted
        as well as letters “b, d, d, d, e, k, k, n, t, u, w” are sorted
        but both appears alternately in the string as far as possible.

        Input :abbfDDhGFBvdFDGBNDasZVDFjkb
        Output :BaBaDbDbDbDdDfFhFjFkGsGvNVZ
     */

    public static void main(String[] args) {
        String s = "bAwutndekWEdkd";
        sort_string(s);
    }

    static void sort_string(String s) {
        Map<Character, Integer> uMap = new TreeMap<>();
        Map<Character, Integer> lMap = new TreeMap<>();

        for (char c : s.toCharArray()) {

            if (Character.isUpperCase(c)) {
                uMap.put(c, uMap.getOrDefault(c, 0) + 1);
            }

            if (Character.isLowerCase(c)) {
                lMap.put(c, lMap.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c1 : uMap.keySet()) {

            if (uMap.get(c1) == 1) {
                sb.append(c1);
                continue;
            }

            int count = uMap.get(c1);
            while (count > 0) {
                sb.append(c1);
                count--;
            }

        }

        for (char c1 : lMap.keySet()) {

            if (lMap.get(c1) == 1) {
                sb.append(c1);
                continue;
            }

            int count = lMap.get(c1);
            while (count > 0) {
                sb.append(c1);
                count--;
            }

        }

        int ucase_index = 0, lcase_index = uMap.size();

        for (int x = 0; x < sb.length(); x++) {

            if (x < uMap.size()) {
                sb2.append(sb.charAt(x));
            }

            if (lcase_index < sb.length()) {
                sb2.append(sb.charAt(lcase_index++));
            }
        }

        System.out.println(sb2.toString());

    }

}
