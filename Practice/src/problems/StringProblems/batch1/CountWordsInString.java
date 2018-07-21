package problems.StringProblems.batch1;

public class CountWordsInString {

    static final int OUT = 0;
    static final int IN = 1;

    public static void main(String[] args) {


        String s = "One two       three\n four\tfive  ";
        countWords2(s);
    }

    public static void countWords(String s) {
        String state = "OUT";
        int wordCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ' || c == '\n' || c == '\t') {
                state = "OUT";
            } else if (state == "OUT") {
                state = "IN";
                wordCount++;
            }
        }

        System.out.println("Number of words : " + wordCount);
    }

    public static void countWords2(String s) {
        boolean inWord = false;
        int wordCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isAlphabetic(s.charAt(i))) {
                inWord = false;
            } else if (inWord == false && Character.isAlphabetic(s.charAt(i))) {
                inWord = true;
                wordCount++;
            }
        }

        System.out.println("Number of words : " + wordCount);
    }

    static int countWords3(String str) {
        int state = OUT;
        int wc = 0;  // word count
        int i = 0;

        // Scan all characters one by one
        while (i < str.length()) {
            // If next character is a separator, set the
            // state as OUT
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t')
                state = OUT;


                // If next character is not a word separator
                // and state is OUT, then set the state as IN
                // and increment word count
            else if (state == OUT) {
                state = IN;
                ++wc;
            }

            // Move to next character
            ++i;
        }
        return wc;
    }
}
