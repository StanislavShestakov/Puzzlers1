package BestExmaples.hardTest.advanced;

public class Outer {
    class Inner1 extends  Outer{
        Inner1(){
            super();
        }
    }
//    class Inner2 extends  Inner1{
//        Inner2(){
//           // super();
//           Outer.this.super();
//        }
//    }

    class Inner2 extends  Inner1{
        Inner2(){
            // super();
           // Outer.this.super();
        }
    }


    public static void main(String[] args) {
       // Inner2 i = new Inner2();
    }
}
