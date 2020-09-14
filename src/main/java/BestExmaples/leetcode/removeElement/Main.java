package BestExmaples.leetcode.removeElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(removeElement(arr,2));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                length++;
            }
        }
        return length;
    }
}
