package problems.StringProblems.batch2;

public class MoveSpacesToFrontOfString {

    public static void main(String[] args) {
        String string = "a b c d";
        int len = string.length();
        len = len-1;
        char[] c = new char[len];
        System.out.println(c);

        int i=0;
        for (i = len; i>=0; i--){
            if (string.charAt(i) != ' '){
//                System.out.println(i--);
                c[len--] = string.charAt(i);
//                c[i--] = string.charAt(i);
            }
        }

    }
}
