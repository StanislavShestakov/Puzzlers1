package BestExmaples.test;

public class DoubleObject {
    public static void main(String[] args) {
        Double d1 = 1d;
        Double d2 = 1d;
        System.out.println(d1 == d2);
        double d3 = 1d;
        double d4 = 1d;
        System.out.println(d3 == d4);
        System.out.println("double ----- float");
        float f = 29.1f;
        double d = 29.1;
        System.out.println( f == d );
        f = 29.1f;
        d = 29.1f;
        System.out.println( f == d );
        int i = 1;
        long l = 1L;
        System.out.println( i == l );
    }
}
