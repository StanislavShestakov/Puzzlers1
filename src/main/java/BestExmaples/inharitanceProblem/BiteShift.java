package BestExmaples.inharitanceProblem;

public class BiteShift {
    public static void main(String args[]) {
        int k = 2;
        int m = 10;
        int s =  1 >> k++ + ++m - --k - m-- << 1;
        System.out.println("s = " + s);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
    }
}
