package problems.arrays.batch1;

public class MaxContiguosSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        method3(arr);
    }

    public static void method1(int[] A){
        int newSum = A[0], max = A[0];

        for (int i=1; i<A.length; i++){
            newSum = Math.max(newSum + A[i], A[i]);
            System.out.println("New sum : "+newSum);
            max = Math.max(max, newSum);
        }
        System.out.println("Max sum : "+max);
    }

    public static void method2(int[] A){
        int start=0, end=0, tmpStart=0, tmpEnd=0;
        int sum=0,  max = Integer.MIN_VALUE;

        for (int i=0; i<A.length; i++){
            sum += A[i];

            if (sum<0){
                sum = 0;
                tmpStart = i+1;
                tmpEnd = i+1;
            }else if (sum > max){
                max = sum;
                end = i;
                start = tmpStart;
            }
        }

        System.out.println("Max sum : "+max);
        System.out.println("Start Index : "+start+ " , End Index : "+end);

    }

    public static void method3(int[] A){
        int max_so_far = 0, max_ending_here = 0;
        int start = 0, end = 0, s = 0;

        for (int i=0; i<A.length; i++){
            max_ending_here += A[i];

            if (max_ending_here < 0){
                max_ending_here = 0;
                s = i+1;

            }else if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                end = i;
                start = s;
            }
        }

        System.out.println("Max contiguos sub-array sum : "+max_so_far);
        System.out.println("Start index : "+start+ ", end Index : "+end);
    }
}
