package BestExmaples.test;

public class DoublePlusFloat {
    public static void main(String[] args) {
        try {
            String value = "29.1";
            System.out.println((Float.valueOf(value) + 1.0) == 30.1);
            System.out.println((Double.valueOf(value) + 1.0) == 30.1);
            System.out.println(Float.valueOf(value)/0);
            System.out.println(Double.valueOf(value)/0);
        }
        catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
    }
}

