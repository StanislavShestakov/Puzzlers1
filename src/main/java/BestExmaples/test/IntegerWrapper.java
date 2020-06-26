package BestExmaples.test;

public class IntegerWrapper {
     public static void main(String[] args) {
        Integer i = new Integer("10");
        if (i.toString() == i.toString()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2);
        System.out.println(i1 == 1000);

        int j = 10;
        Integer x = new Integer(10);
        if(x == j) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

}

