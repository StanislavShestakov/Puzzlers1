package BestExmaples.test;

public class Recurse {
        public static void main(String[] args) {
            recur(99);
        }
        public static void recur(int a) {
            if (a <= 100) {
                System.out.println("a=" + a);
                recur(++a);
                System.out.println("a=" + a);
            }
        }

}
