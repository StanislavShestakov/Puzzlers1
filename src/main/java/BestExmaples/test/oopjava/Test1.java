package BestExmaples.test.oopjava;

public class Test1 {
}
class Base {
    Base(int i) {
        System.out.println("Base");
    }
}
class Derived extends Base {
   //------------------------
    Derived(int i) {
        super(i);
    }
//------------------------------------
    public static void main(String[] argv) {
        Derived d = new Derived(1);
    }
    void Derived() {
        System.out.println("Derived");
    }
}
