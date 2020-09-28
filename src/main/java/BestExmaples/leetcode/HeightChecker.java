package BestExmaples.leetcode;

import java.util.Arrays;

public class HeightChecker {
    //https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3228/
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));

    }
    public static int heightChecker(int[] heights){
        int[] nonSrtdHeight = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int switches = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != nonSrtdHeight[i]){
                switches++;
            }
        }
        return switches;

    }
}
