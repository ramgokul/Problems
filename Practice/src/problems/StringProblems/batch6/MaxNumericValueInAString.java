package problems.StringProblems.batch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxNumericValueInAString {

    public static void main(String[] args) {
        String s = "100klh564abc365bg";
        String pattern = "\\d{1,}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        int max = Integer.MIN_VALUE;

        while (m.find()){
            max = Math.max(max, Integer.parseInt(m.group()));
        }

        System.out.println("Max value : "+max);
    }
}
