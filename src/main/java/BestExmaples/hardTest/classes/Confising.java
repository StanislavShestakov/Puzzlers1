package BestExmaples.hardTest.classes;

public class Confising {
    private Confising(Object o){
        System.out.println("Object");
    }

    private Confising(double[] dArray){
        System.out.println("double array");
    }

    public static void main(String[] args) {
        new Confising(null);
        new Confising((Object) null);
    }
}
