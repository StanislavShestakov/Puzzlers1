package BestExmaples.hardTest.classes;

public class ShadesOfGray {
    public static void main(String[] args) {
       // System.out.println(X.Y.Z);
        System.out.println(Ex.Why.z);
    }
}

//class X {
//    static class Y {
//        static String Z = "Black";
//    }
//
//    static C Y = new C();
//}
//
//class C {
//    String Z = "White";
//}


class Ex {
    static class Why {
        static String z = "Black";
    }

    static See y = new See();
}

class See {
    String z = "White";
}

