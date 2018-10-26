package problems.StringProblems.batch4;

public class PrintAllSubstringOfAGivenString {

    /*
        Given a string as an input. We need to write a program that will print all non-empty substrings of that given string.

        Examples :

        Input :  abcd
        Output :  a
                  b
                  c
                  d
                  ab
                  bc
                  cd
                  abc
                  bcd
                  abcd
     */

    public static void main(String[] args) {
        String s = "abcbabcb";

        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
