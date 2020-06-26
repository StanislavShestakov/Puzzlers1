package BestExmaples.hardTest.intheloop;

public class InTheLoop1 {
    public  static  final int END = Integer.MAX_VALUE;
    public  static  final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for(long i = START; i <= END; i++)
            count++;
        System.out.println(count);



        int i = Integer.MIN_VALUE;
        do{
            f(i);
        }while(i++ != Integer.MAX_VALUE);

    }

    static void  f(int i){
        System.out.println(i);
    }
}
