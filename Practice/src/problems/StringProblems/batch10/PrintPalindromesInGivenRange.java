package problems.StringProblems.batch10;

public class PrintPalindromesInGivenRange {

    /*
        Given a range of numbers, print all palindromes in the given range.
        For example if the given range is {10, 115}, then output should be {11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111}
     */

    public static void main(String[] args) {
        print_palindrome(10, 100);
    }

    static void print_palindrome(int min, int max){
        for (int i=min; i<=max; i++){
            if (isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPalindrome(int num){
        int rev = 0, x = num;

        while (num != 0){
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        return rev == x;
    }
}
