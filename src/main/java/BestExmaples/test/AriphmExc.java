package BestExmaples.test;

public class AriphmExc{
    public static void main(String[] args) {
        int myInt = 0;
        float myFloat = 0;
        try {
            float result = myFloat / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 1");
        }

        try {
            float result = myFloat / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 2");
        }

        try {
            float result = myInt / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 3");
        }

        try {
            float result = myInt / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 4");
        }
    }
}
