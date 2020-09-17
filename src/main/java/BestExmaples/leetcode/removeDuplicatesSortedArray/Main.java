package BestExmaples.leetcode.removeDuplicatesSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int val = nums[0];
        int validSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[validSize] = nums[i];
                validSize++;
                val = nums[i];
            }
        }
        return validSize;
    }
}
