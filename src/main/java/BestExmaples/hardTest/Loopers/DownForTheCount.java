package BestExmaples.hardTest.Loopers;

public class DownForTheCount {
    public static void main(String[] args) {
       final int START  = 2000000000;
       int count = 0;
        for (float f = START; f < START+50; f++)
            count++;
        System.out.println(count);

//        int k = 0;
//        for (int i = 0; i < Float.MAX_VALUE; i++) {
//            k++;
//        }
//        System.out.println(k);
    }
}
