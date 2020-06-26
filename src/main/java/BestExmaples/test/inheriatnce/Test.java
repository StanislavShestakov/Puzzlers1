package BestExmaples.test.inheriatnce;

class A {
    public A() { System.out.print("A "); }
}

class B {
    public B() { System.out.print("B "); }
}

public class Test {
    private A objA = new A();
    private static B objB = new B();

    public Test() {
        System.out.print("Test ");
    }

    public static void main(String[] args){
        System.out.print("Main ");
        new Test();
    }
}