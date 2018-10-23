package problems.StringProblems.batch3;

import java.util.Stack;

public class ReverseAnEquation {
    /*
        Given a mathematical equation using numbers/variables and +, -, *, /. Print the equation in reverse.

        Examples:

        Input : 20 - 3 + 5 * 2
        Output : 2 * 5 + 3 - 20

        Input : 25 + 3 - 2 * 11
        Output : 11 * 2 - 3 + 25

        Input : a + b * c - d / e
        Output : e / d - c * b + a
     */

    public static void main(String[] args) {
        String s = "20 - 3 + 5 * 2";
        reverse_equation2(s);
    }

    static void reverse_equation(String s){
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0, end = s.length()-1;

        while (start < end){

            while (s.charAt(start) != ' '){
                sb.append(s.charAt(start));
                start++;
            }

            stack.push(sb.toString());
            stack.push(String.valueOf(s.charAt(start)));
            start++;
            sb.delete(0, sb.length());
        }

        stack.push(String.valueOf(s.charAt(start)));

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }



    static void reverse_equation2(String s){
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++){

            if (s.charAt(i) == '-' || s.charAt(i) == '+' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == ' '){
                stack.push(sb.toString());
                stack.push(String.valueOf(s.charAt(i)));
                i++;
                sb.delete(0, sb.length());
            }

            sb.append(s.charAt(i));
        }

        stack.push(sb.toString());

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
