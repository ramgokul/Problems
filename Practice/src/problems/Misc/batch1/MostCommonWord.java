package problems.Misc.batch1;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(commonWord(paragraph, banned));

//        paragraph = paragraph.toLowerCase().replace("!","").replace("?","").replace("'","").replace(",","")
//                    .replace(";","").replace(".", "");
//        System.out.println(paragraph);
//
//        String[] arr = paragraph.split("\\s");
//        List<String> list = Arrays.asList(arr);
//
//        Set<String> set = new HashSet<String>(list);
//        set.remove(banned);
//
//        System.out.println(set);
//
//        Map<Integer, String> map = new TreeMap<>();
//
//        for (String s: set) {
//            map.put(Collections.frequency(list, s), s);
//        }
//
//        System.out.println(map);
//
//        System.out.println(map.get(Collections.max(map.keySet())));;
    }

    public static String commonWord(String p, String[] banned){
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String[] words = p.replaceAll("\\pP", "").toLowerCase().split("\\s+");
        int max = 0;
        String commonWord = "";

        for (String w : words) {

            if (!set.contains(w)){
                map.put(w, map.getOrDefault(w, 0)+1);

                if (map.get(w) > max){
                    max = map.get(w);
                    commonWord = w;
                }
            }

        }

        return commonWord;
    }
}
