package problems.StringProblems.batch9;

public class googlecase {

    public static void main(String[] args) {
        String s = "I got intern at geeksforgeeks";
        StringBuilder sb = new StringBuilder(s.toUpperCase());


        sb.replace(0,1, String.valueOf(sb.charAt(0)).toLowerCase());

        for (int i=1; i<sb.length(); i++){
            if (sb.charAt(i) == ' '){
                sb.replace(i+1,i+2, String.valueOf(sb.charAt(i+1)).toLowerCase());
                i+=2;
            }
        }

        System.out.println(sb.toString());
    }
}
