package problems.StringProblems.batch4;

public class CountWordsInAString {

    public static void main(String[] args) {
        String str = "One two       three\n four\tfive  ";
        String state = "OUT";
        int wc = 0;  // word count
        int i = 0;

        // Scan all characters one by one
        while (i < str.length())
        {
            // If next character is a separator, set the
            // state as "OUT"
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t')
                state = "OUT";


                // If next character is not a word separator
                // and state is "OUT", then set the state as IN
                // and increment word count
            else if (state == "OUT")
            {
                state = "IN";
                ++wc;
            }

            // Move to next character
            ++i;
        }

        System.out.println("Word count : "+wc);
    }
}
