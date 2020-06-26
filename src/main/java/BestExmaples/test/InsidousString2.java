package BestExmaples.test;

public class InsidousString2 {
    public static void main(String[] args) {
        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
        x.toUpperCase();
        System.out.println("x = " + x);
        x.replace('a', 'X');
        System.out.println("x = " + x);
    }
}
