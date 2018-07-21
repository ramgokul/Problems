package problems.Misc.batch3;

import java.util.Set;
import java.util.TreeSet;

public class UnionIntersectionOfUnsortedArray {

    public static void main(String[] args) {

        int[] num1 = {7, 1, 5, 2, 3, 6};
        int[] num2 = {3, 8, 6, 20, 7};

        union(num1,num2);
        intersection1(num1,num2);
        intersection2(num1,num2);

    }

    public static void union(int[] num1, int[] num2){
        Set<Integer> set1 = new TreeSet<>();

        for (int n1 : num1){
            set1.add(n1);
        }

        for (int n2 : num2){
            set1.add(n2);
        }

        System.out.println(set1);
    }

    public static void intersection1(int[] num1, int[] num2){
        Set<Integer> set1 = new TreeSet<>();

        for (int n1 : num1){
            set1.add(n1);
        }

        for (int n2 : num2){
            if (set1.contains(n2)){
                System.out.print(n2 + " ");
            }
        }
    }

    public static void intersection2(int[] num1, int[] num2) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for (int n1 : num1) {
            set1.add(n1);
        }

        for (int n1 : num2) {
            set2.add(n1);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
