package BestExmaples.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3270/
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
        int[] arr1 = {2,2};
        System.out.println(findDisappearedNumbers(arr1));
        int[] arr2 = {1,1};
        System.out.println(findDisappearedNumbers(arr2));
        int[] arr3 = {4,3,2,7,7,2,3,1};
        System.out.println(findDisappearedNumbers(arr3));
        int[] arr4 = {1,1,2,2};
        System.out.println(findDisappearedNumbers(arr4));
        int[] arr5 = {10,2,5,10,9,1,1,4,3,7};
        System.out.println(findDisappearedNumbers(arr5));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums.length ==0 ){
            return integers;
        }
        int current = 1;
        int freeSpace = 0;
        int apsent = 0;
        int lastFinded = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > current){
                freeSpace++;
            }
            if(nums[i] < current){
                //todo
                apsent++;
            }
            if(current == nums[i]){
                current++;
                apsent = 0;

            }

            lastFinded = nums[i];
            for (int j = 0; j < freeSpace ; j++) {
                integers.add(current++);
                freeSpace--;
            }
        }

       // System.out.println(lastFinded);
        int lack = nums.length - lastFinded;

        for (int i = 0; i < lack; i++) {
            integers.add(++lastFinded);
        }


        return integers;
    }
}
