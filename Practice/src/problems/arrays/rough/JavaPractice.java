package problems.arrays.rough;

import java.util.*;

public class JavaPractice {

    public static void main(String[] args) {
        set_practice();

    }

    static void stack_practice(){
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<5; i++){
            stack.push(i);
        }

        System.out.println(stack);

        System.out.println("Element at the top of stack : "+stack.peek());
        System.out.println("Search element 3 : "+stack.search(3));

        for (int i=0; i<5; i++){
            int pop_element = stack.pop();
            System.out.println("Element getting popped : "+pop_element);
        }

        System.out.println("Stack after popping all elements : "+stack);
    }

    static void set_practice(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        set2.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union : " +union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Common elements : "+intersection);

        Set<Integer> removeAll = new HashSet<>(set1);
        removeAll.removeAll(set2);

        System.out.println("Difference elements : "+removeAll);


    }
}
