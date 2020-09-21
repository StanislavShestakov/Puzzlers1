package BestExmaples.leetcode;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3157/
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {0,0,1};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length-j; i++) {

                if (nums[i] == 0) {
                    index = i;
                    while (nums[i] == 0 && i < nums.length - 1) {
                        nums[i] = nums[i + 1];
                        nums[i + 1] = 0;
                        i++;
                    }
                    i = index;
                }
            }
        }

     return nums;

    }
}
