package BestExmaples.leetcode;

import java.util.Arrays;

public class ValidMountainArray {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
    public static void main(String[] args) {
        int[] arr4 = {2,1,2,3,5,7,9,10,12,14,15,16,18,14,13};
        System.out.println(validMountainArray(arr4));
        System.out.println(Arrays.toString(arr4));
        int[] arr = {3,7,6,4,3,0,1,0};
        System.out.println(validMountainArray(arr));
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {2,1};
        System.out.println(validMountainArray(arr1));
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {0,3,2,1};
        System.out.println(validMountainArray(arr2));
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {1,3,2};
        System.out.println(validMountainArray(arr3));
        System.out.println(Arrays.toString(arr3));

    }
    public static boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }
        int veerAmount = 0;
        boolean isAscending = false;
        boolean isDescending = false;
        boolean isFirstAscending = false;
        boolean isFirstDescending = false;
        for (int i = 1; i < A.length; i++) {
            if(A[i] == A[i - 1]){
                return false;
            }
            if(A[i] > A[i-1]){
                if(!isAscending){
                    veerAmount++;
                    isAscending = true;
                    isDescending = false;
                    if(!isFirstAscending && !isFirstDescending){
                        isFirstAscending = true;
                    }
                }

            }
            if(A[i] < A[i - 1]){
                isFirstDescending = true;
            }
            if(A[i] < A[i - 1] && veerAmount > 0){
                if(!isDescending) {
                    veerAmount++;
                    isDescending = true;
                    isAscending = false;
                }
            }

        }
       if(veerAmount  == 2 && isFirstAscending){
            return true;
        }else{
            return false;
       }

    }
}
