package BestExmaples.leetcode;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for(int i = 0;i<result.length;i++){
            if(arr[index]!=0){
                result[i] = arr[index];
            }else{
                result[i]=0;
                if(i+1<result.length){
                    result[i+1]=0;
                    i = i+1;
                }
            }
            index++;
        }
        for(int i = 0;i<result.length;i++) arr[i] = result[i];
    }
}
