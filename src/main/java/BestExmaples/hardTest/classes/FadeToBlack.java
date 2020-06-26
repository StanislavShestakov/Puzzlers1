package BestExmaples.hardTest.classes;

public class FadeToBlack {
    static  class Xy extends X.Y{};
    public static void main(String[] args) {
        System.out.println(X.Y.Z);
        System.out.println(((X.Y)null).Z);
        System.out.println(Xy.Z);
    }
}

class X {
    static class Y {
        static String Z = "Black";
    }

    static C Y = new C();
}

class C {
    String Z = "White";
}

