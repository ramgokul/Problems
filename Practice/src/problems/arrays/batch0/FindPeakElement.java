package problems.arrays.batch0;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(finePeaKElementUtil(arr, 0, arr.length-1, arr.length));
    }

    public static int finePeaKElementUtil(int[] a, int low, int high, int n){
        int mid = low + (high - low)/2;

        if ((mid == 0 || a[mid-1] < a[mid]) && (mid == a.length-1 || a[mid+1] < a[mid])){
            System.out.println("Peak element : "+a[mid]);
            return a[mid];
        }else if (mid > 0 && a[mid-1] > a[mid]){
            return finePeaKElementUtil(a, low, mid-1, n);
        }else {
            return finePeaKElementUtil(a, mid+1, high, n);
        }
    }
}
