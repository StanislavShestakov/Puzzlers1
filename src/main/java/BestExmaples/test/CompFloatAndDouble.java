package BestExmaples.test;

public class CompFloatAndDouble {
    public static void main(String[] args) {
        float f = 29.1f;
        double d = 29.1;
        System.out.println( f == d );
        f = 29.1f;
        d = 29.1f;
        System.out.println( f == d );
        int i = 1;
        long l = 1L;
        System.out.println( i == l );
        /*
        В первом случае значение переменной f (типа float) приводится к типу double.
        Но поскольку при этом дополнительные двоичные разряды просто заполняются нулями,
        то получающееся значение не свопадает с 29.1d. Значит, результат сравнения - false.
        * */
    }
}
