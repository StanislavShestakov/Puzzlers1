package BestExmaples.leetcode;

import java.util.Arrays;


public class SquaresOfaSortedArray {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3261/
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortedSquares(int[] A){
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
