package problems.StringProblems.batch10;

public class SplPalindrome {

    /*
        A string is said to be a special palindromic string if either of two conditions is met:

        All of the characters are the same, e.g. aaa.
        All characters except the middle one are the same, e.g. aadaa.
        A special palindromic substring is any substring of a string which meets one of those criteria. Given a string, determine how many special palindromic substrings can be formed from it.

        For example, given the string , we have the following special palindromic substrings: .
     */

    public static void main(String[] args) {
        String s = "abcbaba";
        special_palindrome(s);
    }

    static void special_palindrome(String s){
        int n = s.length();
        String sub_str = null;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<=n; j++){
                sub_str = s.substring(i,j);

                if (sub_str.length() == 1){
                    System.out.println("Spl Palindrome : "+sub_str);
                    continue;
                }

                int count = 0;
                for (int x =0; x<sub_str.length()-1; x++){

                    if (sub_str.charAt(x) != sub_str.charAt(x+1)){
                        count++;
                    }

                }

                if (count == 0){
                    System.out.println("Spl Palindrome : "+sub_str);
                    continue;
                }

                isPalindrome(sub_str);
            }
        }
    }

    static void isPalindrome(String s){
        int x = 0, y = s.length()-1;
        boolean is_palin = true;

        while (x<y){
            if (s.charAt(x) != s.charAt(y)){
                is_palin = false;
                break;
            }
            x++;
            y--;
        }

        if (is_palin){
            System.out.println("Spl Palindrome : "+s);
        }
    }
}
