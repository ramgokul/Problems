package problems.StringProblems.batch0;


import java.util.Arrays;

public class MoveSpacesToBeginningOfString {

    public static void main(String[] args) {
        String str = "geeks for geeks";
        move_spaces2(str);
    }

    static void move_spaces2(String s){
        StringBuilder temp = new StringBuilder();
        int number_of_spaces = 0;

        for (char c : s.toCharArray()){
            if (c != ' '){
                temp.append(c);
            }
        }

        StringBuilder temp2 = new StringBuilder();
        number_of_spaces = s.length() - temp.length();
        System.out.println("Number of spaces : "+number_of_spaces);

        for (int i=0; i<number_of_spaces; i++){
            temp2.append(" ");
        }

        System.out.println(temp2.toString() + temp.toString());
    }
}
