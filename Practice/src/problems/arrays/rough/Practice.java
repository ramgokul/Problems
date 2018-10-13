package problems.arrays.rough;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
//        int arr[] = {1, 4, 45, 6, 0, 19};
//        int x  =  51;
//
//        smallestSubArrayHavingSumGr8erValue(arr, x);
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};

//        findPosOfElementInSortedArrayOfInfiniteNumbers(arr, 100);
        maxTripletSum(arr);

    }

    static boolean aplusbequalcplusd(int[] nums){
        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){

                int sum = nums[i] + nums[j];

                if (!map.containsKey(sum)){
                    map.put(sum, new Pair(nums[i], nums[j]));
                }else {
                    int num1 = map.get(sum).getKey();
                    int num2 = map.get(sum).getValue();

                    System.out.println("Pair found. They are ("+num1+","+num2+") and ("+nums[i]+","+nums[j]+")");
                    return true;
                }
            }
        }

        return false;
    }

    static void divisibleByAnother(int[] nums){

        //Add all array elements to a set
        //Find the max element of the array

        Set<Integer> set = new HashSet<>();
        int max_value = Integer.MIN_VALUE;

        for (int n : nums){
            set.add(n);
            max_value = Math.max(max_value, n);
        }

        for (int n : nums){

            if (n != 0){

                for (int j=n*2; j<=max_value; j+=n){

                    if (set.contains(j)){
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }


    static void largestSubArrayWithZeroSum(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();
        int max_len = 0;
        int sum = 0;

        for (int i=0; i<nums.length; i++){

            sum += nums[i];

            if (nums[i] == 0 && max_len == 0){
                max_len = 1;
                return;
            }

            if (sum == 0){
                max_len = i+1;
            }

            Integer prev_i = map.get(sum);

            if (prev_i == null){
                map.put(sum, i);
            }else {
                max_len = Math.max(max_len, i-prev_i);
            }
        }

        System.out.println("Max length : "+max_len);

    }

    static void arrangeNumbersToFormBiggerNumber(String[] nums){

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){

                String first = nums[i] + nums[j];
                String second = nums[j] + nums[i];

                if (first.compareTo(second) < 0){
                    String temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(String.join("", nums));

    }

    static void commonELementsIn3Arrays(int[] nums1, int[] nums2, int[] nums3){
        Map<Integer, Integer> map = new HashMap<>();


        for (int n : nums1){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (int n :nums2){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (int n :nums3){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List list = map.entrySet().stream().filter(x->x.getValue()==3).map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }

    static void smallestSubArrayHavingSumGr8erValue(int[] nums, int value){

        int start = 0, end = 0, sum = 0, n = nums.length, min_len = n+1;

        for (int i=0; i<n; i++){

            while (end < n && sum <= value){
                sum += nums[end];
                end++;
            }

            while (start < n && sum > value){
                sum -= nums[start];
                start++;

                min_len = Math.min(min_len, end - start);
            }
        }

        System.out.println("Min length sub-array : "+min_len);



    }

    static void findPosOfElementInSortedArrayOfInfiniteNumbers(int[] a, int num){

        int low = 0, high = 1;
        int value = a[0];

        while (value < num){
            low = high;
            high = 2*high;
            value = a[high];
        }

        System.out.println("low : "+low+ ", high : "+high);
        binarySearch(a, low, high, num);

    }


    static void binarySearch(int[] a, int low, int high, int num){
        int mid = low + (high - low)/2;

        if (a[mid] == num){
            System.out.println("Element "+num+ " found at index "+mid);
        }else if (num > a[mid]){
            binarySearch(a, mid+1, high, num);
        }else {
            binarySearch(a, low, mid-1, num);
        }
    }


    static void maxTripletSum(int[] a){
        int first = Integer.MIN_VALUE,  second = first, third = first;

        for (int n : a){
            if (n > first){
                third = second;
                second = first;
                first = n;
            }else if (n > second){
                third = second;
                second = n;
            }else if (n > third){
                third = n;
            }
        }

        int max_sum = first + second + third;
        System.out.println("Max sum : "+max_sum);
    }


}
