package BestExmaples.hardTest.libraryPuzzlers;

import java.lang.reflect.Constructor;

public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private  void greetWorld() throws Exception{
       // System.out.println(Inner.class.newInstance());
        Constructor c = Inner.class.getConstructor(Outer.class);
        System.out.println(c.newInstance(Outer.this));
    }

//

    public static class Inner{
        public String toStirng(){
            return "Hello world";
        }
    }
}
