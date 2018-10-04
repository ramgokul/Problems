package problems.stackproblems;

import java.util.Stack;

public class ReverseAString {

    public static void main(String[] args) {
        String string = "ramnath";
        char[] alphabets = string.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : alphabets){
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println("Reversed string : "+sb.toString());
    }
}
