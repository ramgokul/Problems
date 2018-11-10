package problems.StringProblems.batch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class camelcase {

    public static void main(String[] args) {
        String s = "I got intern at geeksforgeeks";
        StringBuilder sb = new StringBuilder(s);
        String pattern = "\\b[a-zA-Z]";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println("start : "+m.start()+", end : "+m.end());
            sb.replace(m.start(), m.end(), m.group().toUpperCase());
        }

        System.out.println(sb.toString().replaceAll("\\s", ""));
    }
}
