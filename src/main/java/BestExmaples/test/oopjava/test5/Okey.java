package BestExmaples.test.oopjava.test5;

public class Okey extends D{
    public static void doSome(int[]...a){
        for(int[] z:a){
            System.out.println(z[0]);
        }
    }
    public static void main(String[] args) {
        Okey o=new Okey();
        int[] a={7,5,48};
        int[] b={4,2,3};
        o.doSome(a,b);

    }
}
class D{
    public static void doSome(int[]...a){
        for(int[] z:a){
            System.out.println(z[1]);
        }
    }
}