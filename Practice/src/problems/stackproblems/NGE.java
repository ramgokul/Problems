package problems.stackproblems;

import java.util.Stack;

public class NGE {

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i=1; i<arr.length; i++){
            int next = arr[i];

            if (!stack.isEmpty()){
                int element = stack.pop();

                while (element < next){
                    System.out.println(""+element + "---"+ next);

                    if (stack.isEmpty()){
                        break;
                    }
                    stack.pop();
                }

                if (element > next){
                    stack.push(element);
                }
            }
            stack.push(next);
        }

        while (!stack.isEmpty()){
            System.out.println(""+stack.pop()+ "--- -1");
        }
    }
}
