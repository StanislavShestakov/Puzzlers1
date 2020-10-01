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

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int current = 1;
        int freeSpace = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > current){
                freeSpace++;
            }
            if(current == nums[i]){
                current++;
            }
            for (int j = 0; j < freeSpace ; j++) {
                integers.add(current++);
                freeSpace--;
            }
        }
        return integers;
    }
}
