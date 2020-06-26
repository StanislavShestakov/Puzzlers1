package BestExmaples.test.oopjava.test3;

class A { }
class B extends A { }
abstract class C {
    abstract void doAction(A a);
    void start(A a){
        doAction(a);
    }
}
class D extends C {
    void doAction(A a) {
        System.out.println("A action");
    }
    void doAction(B b) {
        System.out.println("B action");
    }
}
public class Test {
    public static void main(String[] args) {
        new D().start(new B());
    }
}