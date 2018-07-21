package problems.Misc.batch2;

public class RotateString {
    public static void main(String[] args) {
        String A = "abcde"; String B = "cdeab";

        if (A.length() == B.length() && (A+A).contains(B)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
