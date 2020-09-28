package BestExmaples.leetcode;

import java.util.Arrays;

public class ThirdMaximumNumber {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3231/
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int counter = 0;
        for (int i = nums.length-1; i >= 0; i--) {

           if(nums[i] < max){
               max = nums[i];
               counter++;
               if(counter == 2){
                   return max;
               }
           }
        }
        if(counter < 2){
            return nums[nums.length-1];
        }
        return max;
    }
}
