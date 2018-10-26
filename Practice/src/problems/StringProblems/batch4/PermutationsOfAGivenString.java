package problems.StringProblems.batch4;

public class PermutationsOfAGivenString {

    /*
        A permutation, also called an “arrangement number” or “order”, is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
        Source: Mathword

        Below are the permutations of string ABC.
        ABC ACB BAC BCA CBA CAB
     */

    public static void main(String[] args) {
        String string = "ABC";
        System.out.println(rotate(string, 1, 3));
    }

    static String swap(String s, int start, int end){

        char[] characters = s.toCharArray();

        while (start < end){
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }

        return new String(characters);
    }

    static String rotate(String s, int k, int n){
        String s1 = swap(s, 0, k-1);
        String s2 = swap(s1, k, n-1);
        return swap(s2, 0, n-1);
    }
}
