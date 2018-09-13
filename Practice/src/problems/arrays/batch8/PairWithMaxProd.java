package problems.arrays.batch8;

public class PairWithMaxProd {


    /*
        Given an array with both +ive and -ive integers, return a pair with highest product.
        Examples :

        Input: arr[] = {1, 4, 3, 6, 7, 0}
        Output: {6,7}

        Input: arr[] = {-1, -3, -4, 2, 0, -5}
        Output: {-4,-5}
     */

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 7, 0};

        int posa = Integer.MIN_VALUE, posb = Integer.MIN_VALUE;
        int nega = posa, negb = posb;

        for (int i=0; i<arr.length; i++){

            if (arr[i] > posa){
                posb = posa;
                posa = arr[i];
            }else if (arr[i] > posb){
                posb = arr[i];
            }


            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(nega)){
                negb = nega;
                nega = arr[i];
            }else if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negb)){
                negb = arr[i];
            }

        }

        System.out.println("Pos Numbers are "+posa+ ","+posb);
        System.out.println("Pos Numbers are "+nega+ ","+negb);

        int max_prod = Math.max(nega*negb, posa*posb);
        System.out.println("Max prod : "+max_prod);
    }
}
