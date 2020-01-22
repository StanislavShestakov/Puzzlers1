package expressivePuzzlers;

public class Tweedledee {
    public static void main(String[] args) {
        Object x = "Buy ";
        Object i = "Effective Java!";
        // x = x + i;
        //x += i;
        // i += x;
        // i = i + x;
        short xx = 0;
        int ii = 123456;
        System.out.println(xx + ii);
        xx += ii;
        System.out.println(xx);
    }
}
