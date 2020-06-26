package BestExmaples.test;

public class ComplulsoryNotInvokeSuperConstructor {
    static short s = 17;
    public  ComplulsoryNotInvokeSuperConstructor(short ss) {
        new  ComplulsoryNotInvokeSuperConstructor();
        s *= ss;
    }
    public  ComplulsoryNotInvokeSuperConstructor() { ; }
}
class Bridle extends  ComplulsoryNotInvokeSuperConstructor {
    public Bridle(int s) { System.out.println(s + 1); }
    public static void main(String[] args) {
        Bridle b = new Bridle(3);
    }
}

