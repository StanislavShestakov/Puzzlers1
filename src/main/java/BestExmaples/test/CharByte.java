package BestExmaples.test;

public class CharByte {
    static byte m1() {
        final char c1 = '\u0001';
        return c1;                                  // 1
    }
  //  static byte m2(final char c2) { return c2; }  // 2
    public static void main(String[] args) {
        char c3 = '\u0003';
    //    System.out.print("" + m1() + m2(c3));         //


    }
}
