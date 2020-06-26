package BestExmaples.test;

public class WrongRuntimeExc {
    String s;

    public static void main(String[] args) {
        String s ="";
        System.out.println(s.toUpperCase());
        WrongRuntimeExc localVsInstance = new  WrongRuntimeExc();
        System.out.println(localVsInstance.s.toUpperCase());
    }
}
