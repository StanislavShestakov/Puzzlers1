package BestExmaples.hardTest.classes;

public class Creator {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++)
//            Creature c =new Creature();  //not compile
//        System.out.println(Creature.numCreated());

        for (int i = 0; i < 100; i++) {
            Creature c = new Creature();  // compile
        }
        System.out.println(Creature.numCreated());

        for (int i = 0; i < 100; i++)
            new Creature(); // compile


    }
}
class Creature{
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }

    public static long numCreated(){
        return numCreated;
    }
}
