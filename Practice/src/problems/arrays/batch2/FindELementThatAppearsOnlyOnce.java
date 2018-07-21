package problems.arrays.batch2;

public class FindELementThatAppearsOnlyOnce {

    public static void main(String[] args) {
        int ar[] = {7, 3, 5, 4, 5, 3, 4};

        int res = ar[0];

        for (int i=1; i<ar.length; i++){
            res = res ^ ar[i];
        }

        System.out.println("Element that appears only once : "+res);
    }
}
