package problems.stackproblems;

import java.util.Stack;

public class DeleteMiddleOfStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        deleteMidElement(s, s.size(), 0);

    }

    static void deleteMidElement(Stack<Integer> s, int len, int curr){

        if (s.isEmpty() || curr == len){
            return;
        }

        int x = s.pop();
        deleteMidElement(s, len, curr+1);

        if (curr != len/2){
            s.push(x);
        }

        System.out.println(s);
    }
}
