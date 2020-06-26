package BestExmaples.test;

public class WrongByteOperator {
    public static void main(String[] args) {
        byte a = 1;
        byte b = ++a;
        byte c = (byte)-a;
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}
