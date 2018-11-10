package problems.StringProblems.batch8;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveXtraSpaces {

    /*
        Given a string containing many consecutive spaces, trim all spaces so that all words should contain only a single space between them. The conversion should be done in-place and solution should handle trailing and leading spaces and also remove preceding spaces before common punctuation like full stop, comma and a question mark.

        Examples:

        Input:
        str = "   Hello Geeks . Welcome   to  GeeksforGeeks   .    ";
        Output:
        "Hello Geeks. Welcome to GeeksforGeeks."

        Input:
        str = "GeeksforGeeks";
        Output:
        "GeeksforGeeks"
        (No change is needed)

     */

    public static void main(String[] args) {
        String str = "   Hello Geeks . Welcome   to  GeeksforGeeks   .    ";
        String pattern = "[\\w.]+";
        List<String> list = new LinkedList<>();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while (m.find()){
            list.add(m.group());
        }

        StringBuilder sb =  new StringBuilder();

        for (String s : list){
            if (!s.equals(".")){
                sb.append(s + " ");
            }else {
                sb.deleteCharAt(sb.length()-1);
                sb.append(s);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
