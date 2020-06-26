package BestExmaples.hardTest;

class Cache {
    static {
        intializeIfNecessary();
    }

    private static int sum;

    public static int getSum() {
        intializeIfNecessary();
        return sum;
    }

    private static boolean initialized = false;

    private static synchronized void intializeIfNecessary() {
        if (!initialized) {
            for (int i = 0; i < 100; i++) {
                sum += i;
                initialized = true;
            }
        }
    }
}


public class Client {
    public static void main(String[] args) {
        System.out.println(Cache.getSum());
    }
}
