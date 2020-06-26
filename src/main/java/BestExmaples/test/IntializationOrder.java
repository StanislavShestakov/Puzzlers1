package BestExmaples.test;

public class IntializationOrder {
    {
        System.out.println("1");
    }

    IntializationOrder () {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }

    public static void main(String[] args) {
        new IntializationOrder();
    }
}
