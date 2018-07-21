package problems.Misc.batch3;

public class SelfDividingNumber {

    public static void main(String[] args) {
        System.out.println(sdn(124));
    }

    public static boolean sdn(int n){
        int x = n;
        while (x > 0) {
            int d = x % 10;
            if (d == 0 || (n % d) > 0) return false;
            x /= 10;
        }
        return true;
    }
}
