package BestExmaples.hardTest.advanced;

public class PoisonParen {
    public static void main(String[] args) {
        int i = -(1);
        //int j = -(2147483648);
        System.out.println(i);
    }
}
