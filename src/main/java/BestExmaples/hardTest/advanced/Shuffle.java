package BestExmaples.hardTest.advanced;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    private static Random rnd = new Random();

    public static  void shuffle(Object[] a){
        for (int i = 0; i < a.length; i++) {
           // swap(a,i, rnd.nextInt(a.length));
            swap(a,i, rnd.nextInt(a.length-1));
        }
    }

    private static void swap(Object[] a, int i, int j){
        Object tmp = a[i];
        a[i] = a[i];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Integer [] a = new Integer[1000];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
