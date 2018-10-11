package problems.StringProblems.batch2;

public class RemoveSpacesFromString {

    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        char[] ch = new char[s.length()-1];
        int index = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != ' '){
                ch[index++] = s.charAt(i);
            }
        }

        ch[index] = '\0';

        System.out.println(ch);
    }
}
