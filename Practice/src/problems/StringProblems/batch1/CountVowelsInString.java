package problems.StringProblems.batch1;

public class CountVowelsInString {

    public static void main(String[] args) {
        System.out.println(countVowels("abc de", 6));

    }

    public static int isVowel(char c){
        c = Character.toUpperCase(c);

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return 1;
        }

        return 0;
    }

    public static int countVowels(String s, int n){
        if (n == 1){
            return isVowel(s.charAt(n-1));
        }

        return countVowels(s, n-1) + isVowel(s.charAt(n-1));
    }
}
