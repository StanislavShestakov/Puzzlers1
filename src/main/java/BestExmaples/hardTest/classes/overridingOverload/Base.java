package BestExmaples.hardTest.classes.overridingOverload;

public class Base {

    public void f(){}
}
class Derived extends Base{
    public  void f(){} // Overriding Base.f();
}

class Base1 {

        public static void f(){}
}
class Derived1 extends Base1{
    public static void f(){} // Hide Base.f();
}


class CircuitBreaker{
    public void f(int i) {} // int overloadindg
    public void f(String i) {} // String overloadindg
}

class WhoKnows{
    static  String sentence = "I don`t know.";

    public static void main(String[] args) {
        String sentence = "I know!"; // shadows static field
        System.out.println(sentence);  //prints local variable
    }
}

class Best{
    private  final int size;

    public Best(int size) { //Parameter shadows Belt.size
        this.size = size;
    }
}

 class Obscure {

//     static  String System; // obscures type java.lang.System
    public static void main(String[] args) {
        //Next line wont,t compile: System refers to static fiald
     //    System.out.println("hello, obscure world!");  // do not compile

    }
}