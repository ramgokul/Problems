package problems.Misc.batch0;

public class AddNumbers {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(sumDigits2(4444));
        System.out.println(sum++);

    }

    public static int sumDigits(int n) {


        if (n == 0) {
            return sum;
        } else {
            sum += n%10;
            sumDigits(n / 10);
        }

        return sum;
    }

    public static int sumDigits2(int num) {
        if (num < 10) {
            return num;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

}
