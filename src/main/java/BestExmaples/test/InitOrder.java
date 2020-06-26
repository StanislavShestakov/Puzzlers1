package BestExmaples.test;

public class InitOrder {
    {
        System.out.println("Block");
    }
    int x = getX();

    static {
        System.out.println("Static block");
    }

    public int getX() {
        System.out.println("X variable");
        return 5;
    }

    static int y = getY();
    public static int getY() {
        System.out.println("Y variable");
        return 6;
    }


    public static void main(String[] args) {
        InitOrder m = new InitOrder();
    }
}
