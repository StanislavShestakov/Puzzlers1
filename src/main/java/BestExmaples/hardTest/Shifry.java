package BestExmaples.hardTest;

public class Shifry {

    public static void main(String[] args) {
//        int i = 0;
//        while(-1 << i != 0)
//            i++;
//        System.out.println(i);

        int distance = 0;
        for (int val = -1; val !=0 ; val <<= 1)
            distance++;
        System.out.println(distance);


        int distance1 = 0;
        for (long val = -1; val !=0 ; val <<= 1)
            distance1++;
        System.out.println(distance1);


    }
}
