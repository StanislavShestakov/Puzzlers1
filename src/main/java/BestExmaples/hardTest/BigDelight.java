package BestExmaples.hardTest;

public class BigDelight {
    public static void main(String[] args) {
        for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++){
            if(b == 0x90)
                System.out.println("Joy!");
            if(b == (byte)0x90)
                System.out.println("Joy!");
            if((b & 0xff)== 0x90)
                System.out.println("Joy!");
        }
    }
}
