package problems.StringProblems.batch8;

public class PrintStringAftSpecCharHasOccured {

    /*
        Given a string, a character, and a count, the task is to print the string after the specified character has occurred count number of times.Print “Empty string” in case of any unsatisfying conditions.(Given character is not present, or present but less than given count, or given count completes on last index). If given count is 0, then given character doesn’t matter, just print the whole string.

        Examples:

        Input  :  str = "This is demo string"
                  char = i,
                  count = 3
        Output :  ng

        Input :  str = "geeksforgeeks"
                 char = e,
                 count = 2
        Output : ksforgeeks
     */

    public static void main(String[] args) {
        String string = "geeksforgeeks";
        char c = 'e';
        int count = 2;

        System.out.println(print_string(string, c, count));

    }

    static String print_string(String s, char c, int char_count){
        int count = 0;

        for (int i=0; i<s.length(); i++){

            if (s.charAt(i) == c){
                count++;
            }

            if (count == char_count){
                return s.substring(i+1, s.length());
            }
        }

        if (count < char_count){
            return "not possible";
        }

        return "not possible";
    }
}
