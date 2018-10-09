package problems.StringProblems.batch1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveMinCharsToMakeStringsAnagram {

    /*
        Given two strings in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find minimum number of characters to be deleted to make both the strings anagram?
        If two strings contains same data set in any order then strings are called Anagrams.

        Examples :

        Input : str1 = "bcadeh" str2 = "hea"
        Output: 3
        We need to remove b, c and d from str1.

        Input : str1 = "cddgk" str2 = "gcd"
        Output: 2

        Input : str1 = "bca" str2 = "acb"
        Output: 0
     */

    public static void main(String[] args) {
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//
        String str1 = "bcadeh", str2 = "hea";
//
//        for (int i=0; i<str1.length(); i++){
//            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
//        }
//
//        for (int i=0; i<str2.length(); i++){
//            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
//        }
//
//        System.out.println(map1);
//        System.out.println(map2);
//
//        int count = 0;
//
//        for (Map.Entry<Character, Integer> data : map1.entrySet()){
//            char key = data.getKey();
//            int value = data.getValue();
//
//            int num1 = map1.get(key) == null ? 0 : map1.get(key);
//            int num2 = map2.get(key) == null ? 0 : map2.get(key);
//
//            count += num1 - num2;
//        }
//
//        System.out.println();
//        System.out.println("Characters to be removed : "+count);

        minCharsToBeDeleted(str1, str2);
    }

    static void minCharsToBeDeleted(String s1, String s2){
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        int result = 0;

        for (char c1 : s1.toCharArray()){
            arr1[c1 - 'a']++;
        }

        for (char c2 : s2.toCharArray()){
            arr2[c2 - 'a']++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i=0; i<26; i++){
            result += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Result : "+result);
    }
}
