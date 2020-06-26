package BestExmaples.test;

public class CharInt {
    public static void main(String[] args) {
        byte a  = 4;
        byte b  = 3;
        System.out.println(a * b);
        //byte c = a * b;   // do not compile
        //byte c = a + b;   // do not compile
        a = 127;
        a += 1;   //compile matherfucker!!! -\_(o)_/-
        System.out.println(a);  //do not output
        a = 1;
        b = ++a;
       // byte c = -a; //do not compile
        System.out.print(a);
        System.out.print(b);
        //System.out.print(c);

    }
}
