package BestExmaples.test;

public class ForWitoutDefinitionI {
    final int x = 1;

    public static void main(String [] str) {
        int x = 2;                            //1
        for (x = 3 ; x < 5 ; x++);            //2
        System.out.println("x=" + x);

    }
}
