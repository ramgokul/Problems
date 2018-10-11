package problems.stackproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DeleteMiddleOfStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println("Input : "+s);
        System.out.println("Top1 : "+s.peek());
//        deleteMidElement(s, s.size(), 0);
        deleteMidElement2(s);

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

    static void deleteMidElement2(Stack<Integer> s){
        List<Integer> list = new LinkedList<>();

        while (!s.isEmpty()){
            list.add(s.pop());
        }

//        System.out.println(list);

        int counter = 0;

        for (int i=list.size()-1; i>=0; i--){
            if (counter != list.size()/2){
                s.push(list.get(i));
            }
            counter++;
        }

        System.out.println("Output : "+s);
        System.out.println("Top2 : "+s.peek());
    }
}
