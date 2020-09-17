package BestExmaples.leetcode;

import java.util.Arrays;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {0,0};
        System.out.println(checkIfExist(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    if(arr[i] == 0 && arr[j] ==0){
                        return true;
                    }
                    if (arr[i] + arr[i] == arr[j]) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
