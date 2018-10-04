package problems.stackproblems;

import java.util.Stack;

public class ReverseANumber {

    public static void main(String[] args) {
        int number = 12345;
        Stack<Integer> stack = new Stack<>();

        while (number != 0){
            stack.push(number % 10);
            number = number/10;
        }

        System.out.println(stack);

        int reverse = 0, i=1;

        while (!stack.isEmpty()){
            reverse = reverse + stack.pop() * i;
            i = i * 10;
        }

        System.out.println("Reverse number : "+reverse);
    }
}
