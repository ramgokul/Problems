package problems.StringProblems.batch4;

import java.util.Arrays;

public class ReturnAllSubsequencesInString {

    public static void main(String[] args) {
        String[] a = return_subsequence("xyz");
        System.out.println(Arrays.toString(a));
    }

    static String[] return_subsequence(String string){

        if (string.length() == 0){
            String[] ans = {""};
            return ans;
        }

        String[] smallAns = return_subsequence(string.substring(1));

        System.out.println(Arrays.toString(smallAns));
        String[] ans = new String[2 * smallAns.length];

//        int k=0;
//
//        for (int i=0; i<smallAns.length; i++){
//            ans[k] = smallAns[i];
//            k++;
//        }

        return smallAns;
    }
}
