package BestExmaples.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3270/
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1,26};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
          if ((nums[i] - nums[i-1]) > 1){
              int counter = (nums[i] - nums[i-1]);
              for (int j = 1; j < counter; j++) {
                  integers.add(nums[i-1]+j);
              }
          }
        }
        return integers;
    }
}
