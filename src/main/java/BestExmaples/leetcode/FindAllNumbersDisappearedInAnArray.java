package BestExmaples.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3270/
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        int dblAmount = 0;
        for (int i = 1; i < nums.length; i++) {
          if(nums[i]  ==  nums[i-1]){
              dblAmount++;
          }
          if ((nums[i] - nums[i-1]) > 1){
              int counter = (nums[i] - nums[i-1]);
              for (int j = 1; j < counter; j++) {
                  if(dblAmount > 0) {
                      integers.add(nums[i - 1] + j);
                      dblAmount--;
                  }
              }
          }
        }
        for (int i = 0; i < dblAmount; i++) {
            integers.add(nums[nums.length - 1] + i+1);
        }
        return integers;
    }
}
