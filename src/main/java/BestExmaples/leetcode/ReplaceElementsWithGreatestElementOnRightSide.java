package BestExmaples.leetcode;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3259/
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > arr[i-1]){
                arr[i-1] = arr[i];
            }
        }

        return  arr;
    }
}
