package BestExmaples.leetcode.removeElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int validSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[validSize] = nums[i];
                validSize++;
            }
        }
        return validSize;
    }
}
