package BestExmaples.test;

class A2 {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

public class Override extends A2 {
    int i = 10;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A2 obj = (A2) new Override();
        System.out.println(obj.increment());
    }
}