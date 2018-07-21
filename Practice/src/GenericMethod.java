import java.lang.annotation.ElementType;

public class GenericMethod {

    public static void main(String[] args) {
        Integer[] arr1 = {10,20,30};
        String[] arr2 = {"ram", "rishi", "nav"};
        Double[] arr3 = {1.1, 2.2, 3.3};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    public static <E> void printArray(E[] array){
        for (E e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
