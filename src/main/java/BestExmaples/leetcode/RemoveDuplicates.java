package BestExmaples.leetcode;

import java.util.Arrays;
//https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
       int index =1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
