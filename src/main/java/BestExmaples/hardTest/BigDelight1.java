package BestExmaples.hardTest;

public class BigDelight1 {
   // private static  final byte TARGET = 9x90;
    private static  final byte TARGET = (byte)0x90;
    public static void main(String[] args) {
        for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == TARGET)
                System.out.println("Joy!");
        }
    }
}
