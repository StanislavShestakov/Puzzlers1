package BestExmaples.test;

class A3 {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

public class OverrideClassCast extends A3 {
    int i = 1;                                        // 1
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        OverrideClassCast b = (OverrideClassCast) new A3();                            // 2
        System.out.println(b.increment());
    }
}