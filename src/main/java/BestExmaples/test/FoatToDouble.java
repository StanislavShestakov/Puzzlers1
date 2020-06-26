package BestExmaples.test;

public class FoatToDouble {
    public static void main(String[] args) {
        //float f = 1.0 + 1.0f;
        float f = 1 + 1.0f;
        f = f + 1;
        System.out.println( f/0 );
        System.out.println(Math.sqrt(-2.0));
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(0.0/0);
        System.out.println(1.0/0);
    }
}
