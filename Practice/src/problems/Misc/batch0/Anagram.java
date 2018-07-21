package problems.Misc.batch0;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "nebula";
        String t = "unable";

        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t){

        if (s.length() != t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
