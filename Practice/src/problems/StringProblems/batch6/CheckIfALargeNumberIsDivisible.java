package problems.StringProblems.batch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfALargeNumberIsDivisible {

    /*
        1. A number is divisible by 4 if the last 2 digits are divisible by 4
        2. A number is divisible by 6 if
            a) The last digit is divisible by 2
            b) The sum of digits is divisible by 3
        3. A number is divisible by 11 if
            (Sum of all odd numbered digits) MINUS (Sum of all even numbered digits) is divisible by 11
        4. A number is divisible by 3 if sum of its digits is divisible by 3.
        5. A number is divisible by 8 if last three digits are divisible by 8.
        6. A number is divisible by 9 if sum of its digits is divisible by 9.
        7. A number is divisible by 999 if sum of its 3-digit-groups (if required groups are formed by appending a 0s at the beginning) is divisible by 999.
     */

    public static void main(String[] args) {
        String number = "1998";
        System.out.println(divisible_by_999(number));
    }

    static boolean divisible_by_999(String string){
        int n = string.length();
        String new_num = null;

        if (n%3 == 1){
            new_num = "00" + string;
        }else if (n%3 == 2){
            new_num = "0" + string;
        }else {
            new_num = string;
        }

        String pattern = "\\d{3}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(new_num);

        int sum = 0;
        while (m.find()){
            sum += Integer.parseInt(m.group());
        }

        return (sum % 999) == 0;
    }
}
