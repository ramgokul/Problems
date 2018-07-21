package problems.Misc.batch0;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(11));
    }

    public static int squareNumberSum(int n){
        int squareSum = 0;

        while (n != 0){
            squareSum += (n%10) * (n%10);
            n /= 10;
        }

        return squareSum;
    }

    public static boolean isHappy(int n){
        int slow, fast;
        slow = fast = n;

        do {
            slow = squareNumberSum(slow);
            fast = squareNumberSum(squareNumberSum(fast));

        }while (slow != fast);

        return (slow == 1);
    }
}
