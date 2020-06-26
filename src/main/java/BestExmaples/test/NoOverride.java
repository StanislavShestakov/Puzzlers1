package BestExmaples.test;

class A {
    public void m(Number n) {
        n = 5 / 3;
        System.out.println("class A, method m : " + n);
    }
}

class B extends A {
    public void m(Double d) {
        d = d / 3;
        System.out.println("class B, method m : " + d);
    }
}

public class NoOverride {
    public static void main(String args[]) {
        A a = new B();
        a.m(5.0);
    }
}