package BestExmaples;

import java.util.Arrays;

/**
 * Created by Stas on 29.05.2019.
 */
public class BubbleSortAnyArray {
    public static void main(String[] args) {

        Integer arr[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static <E extends Comparable<E>> E[] bubbleSort(E[] arr) {
//        int n = arr.length;
//        int temp = 0;
//        for(int i=0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    //swap elements
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
        return arr;
    }

    }
