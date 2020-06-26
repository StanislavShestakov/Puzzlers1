package BestExmaples.test;

public class PrivateMethod {
    private int getX() {
        return 5;
    }

    public int get2X() {
        PrivateMethod x = new PrivateMethod();
        return 2 * x.getX();
    }
}
