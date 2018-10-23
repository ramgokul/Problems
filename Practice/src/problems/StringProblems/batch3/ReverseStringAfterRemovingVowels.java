package problems.StringProblems.batch3;

public class ReverseStringAfterRemovingVowels {

    public static void main(String[] args) {
        String string = "Hi there, how are you?";
        StringBuilder sb =  new StringBuilder();

        for (int i=string.length()-1; i>=0; i--){
            char indChar = string.charAt(i);

            if (indChar != 'a' && indChar != 'A' && indChar != 'E' && indChar != 'e' && indChar != 'i' && indChar != 'I' && indChar != 'o'
                    && indChar != 'O' && indChar != 'u' && indChar != 'U'){

                sb.append(string.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
