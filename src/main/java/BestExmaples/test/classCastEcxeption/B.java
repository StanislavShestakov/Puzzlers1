package BestExmaples.test.classCastEcxeption;

class A {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

public class B extends A {
    int i = 10;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A obj = (A) new B();
        B obj1 = (B) new A(); //ClassCastException Runtime
        System.out.println(obj.increment());
    }
}
