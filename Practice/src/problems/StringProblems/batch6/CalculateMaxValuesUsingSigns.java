package problems.StringProblems.batch6;

public class CalculateMaxValuesUsingSigns {

    /*
        Given a string of numbers, the task is to find the maximum value from the string, you can add a ‘+’ or ‘*’ sign between any two numbers.

        Examples:

        Input : 01231
        Output :
        ((((0 + 1) + 2) * 3) + 1) = 10
        In above manner, we get the maximum value i.e. 10

        Input : 891
        Output :73
        As 8*9*1 = 72 and 8*9+1 = 73.So, 73 is maximum.
     */

    public static void main(String[] args) {
        String string = "01231";

        int res = string.charAt(0) - '0';

        for (int i=1; i<string.length(); i++){
            if (res == 0 || res == 1 || string.charAt(i) == '0' || string.charAt(i) == '1'){
                res += string.charAt(i) - '0';
            }else{
                res *= string.charAt(i) - '0';
            }
        }

        System.out.println(res);
    }
}
