package BestExmaples;

import java.util.Arrays;

/**
 * Created by Stas on 29.05.2019.
 */
public class BubbleSortAnyArray {
    public static void main(String[] args) {

        Integer integers[] ={3,60,35,2,45,320,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(bubbleSort(integers)));
        System.out.println("\n==========================\n");
        String strings[] = {"apple","carrot","tomato","peas","barries","potato","cerries"};
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(bubbleSort(strings)));
    }

    static <E extends Comparable<E>> E[] bubbleSort(E[] arr) {
        int n = arr.length;
        E temp;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

}
