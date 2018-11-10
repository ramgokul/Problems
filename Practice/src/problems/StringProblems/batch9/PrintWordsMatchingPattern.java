package problems.StringProblems.batch9;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintWordsMatchingPattern {

    /*
        Given a dictionary of words where each word follows CamelCase notation, print all words in the dictionary that match with a given pattern consisting of uppercase characters only.

        CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter. Common examples include: “PowerPoint” and “WikiPedia”, “GeeksForGeeks”, “CodeBlocks”, etc.

        Examples:

        Input:
        dict[] = ["Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek",
        "HiTechWorld", "HiTechCity", "HiTechLab"]

        For pattern "HT",
        Output: ["HiTech", "HiTechWorld", "HiTechCity", "HiTechLab"]

        For pattern "H",
        Output: ["Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek",
            "HiTechWorld", "HiTechCity", "HiTechLab"]

        For pattern "HTC",
        Output: ["HiTechCity"]


        Input:
        dict[] = ["WelcomeGeek","WelcomeToGeeksForGeeks", "GeeksForGeeks"]

        For pattern "WTG",
        Output: ["WelcomeToGeeksForGeeks"]

        For pattern "GFG",
        Output: [GeeksForGeeks]

        For pattern "GG",
        Output: No match found
     */

    public static void main(String[] args) {

        String[] arr = {"Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek",
                "HiTechWorld", "HiTechCity", "HiTechLab"};

        String pattern = "[HT]";
        int pat_len = pattern.length();

        Set<String> set = new HashSet<>();
        Pattern p;
        Matcher m;

        int count = 0;

        for (String s : arr){
            p = Pattern.compile(pattern);
            m = p.matcher(s);

            while (m.find()){
                count++;
            }

            if (count == 2){
                set.add(s);
            }

            count = 0;
        }

        System.out.println(set);
    }
}
