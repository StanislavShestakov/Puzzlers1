package BestExmaples.test.oopjava.test2;


interface Base {
    boolean m1();
    byte m2(short s);
}

class Test implements Base {
    public boolean m1() { return false; } // why public
    public byte m2(short s) { return 42; }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
