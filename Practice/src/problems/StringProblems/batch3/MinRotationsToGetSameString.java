package problems.StringProblems.batch3;

public class MinRotationsToGetSameString {

    /*
        Given a string, we need to find the minimum number of rotations required to get the same string.

        Examples:

        Input : s = "geeks"
        Output : 5

        Input : s = "aaaa"
        Output : 1
     */

    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(min_rotations(s));
    }

    static int min_rotations(String s){
        StringBuilder sb1 = new StringBuilder(s);
        sb1.append(sb1);

        StringBuilder sb2 = new StringBuilder();
        int count = 0;

        for (int i=1; i<sb1.length(); i++){
            sb2.delete(0, sb2.length());
            sb2.append(sb1.substring(i, s.length()+i));

            if (sb2.toString().equals(s)){
                return i;
            }

        }

        return s.length();
    }
}
