package BestExmaples.test;
interface I_A { public void out1(); }
interface I_B { public void out2(); }

class Impl implements I_A, I_B {     //1
    public void out2() {
        System.out.print("2");
    }
    public void out1() {
        System.out.print("1");
    }
}

public class ChangeTypeOfLink {
    public static void main(String[] args) {
        Impl impl = new Impl();
        I_A a;
        a = impl;
        a.out1();
        ((I_B) a).out2();              //2
    }
}