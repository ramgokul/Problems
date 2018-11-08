package problems.StringProblems.batch8;

public class CharPairsAtSameDistanceAsEngAlpha {
    /*
        Given a string, the task is to count the number of pairs whose elements are at same distances as in the English alphabets.
        Note : Absolute distance between characters is considered.

        Examples :

        Input:  str = "geeksforgeeks"
        Output:  4
        Explanation: In this (g, s), (e, g), (e, k), (e, g)
        are the pairs that are at same distances as
        in English alphabets.

        Input:  str = "observation"
        Output:  4
        Explanation: (b, i), (s, v), (o, n), (v, t) are
        at same distances as in English alphabets.
     */

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int n = str.length(), result = 0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){

                if (Math.abs(str.charAt(i) - str.charAt(j)) == Math.abs(i-j)){
                    System.out.println("Pair : ("+str.charAt(j)+","+str.charAt(i)+")");
                    result++;
                }

            }
        }

        System.out.println("Number of pairs : "+result);

    }
}
