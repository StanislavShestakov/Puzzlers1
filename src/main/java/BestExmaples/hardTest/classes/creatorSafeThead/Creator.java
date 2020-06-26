package BestExmaples.hardTest.classes.creatorSafeThead;
import java.util.concurrent.atomic.AtomicLong;
public class Creator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Creature1 c = new Creature1();  // compile
        }


        for (int i = 0; i < 100; i++)
            new Creature1(); // compile
        System.out.println(Creature1.numCreated());

        for (int i = 0; i < 100; i++)
            new Creature2(); // compile
        System.out.println(Creature2.numCreated());
    }

}

class Creature1{
    private static long numCreated = 0;

    public Creature1() {
        synchronized (Creature1.class) {
            numCreated++;
        }
    }

    public static synchronized long numCreated(){
        return numCreated;
    }
}

class Creature2{
    private static AtomicLong numCreated = new AtomicLong();

    public Creature2() {
            numCreated.incrementAndGet();
    }

    public static synchronized long numCreated(){
        return numCreated.get();
    }
}

