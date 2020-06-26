package BestExmaples.test;

public class InsidousStatic {
        static { i = 5; } //compiler will ignore that
        static int i = 6;

        public static void main(String[] args) {
            System.out.println(i);
        }

}
