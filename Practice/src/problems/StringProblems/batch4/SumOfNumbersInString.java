package problems.StringProblems.batch4;

public class SumOfNumbersInString {

    public static void main(String[] args) {
        String s = "123abc";
        StringBuilder sb =  new StringBuilder();
        int count = 0;

        for (int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if (Character.isDigit(c)){

                while (i<s.length() && Character.isDigit(s.charAt(i))){
                    sb.append(s.charAt(i));
                    i++;
                }

                count += Integer.parseInt(sb.toString());
                sb.delete(0, sb.length());
            }

        }

        System.out.println("Sum : "+count);
    }
}
