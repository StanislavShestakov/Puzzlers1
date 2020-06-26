package BestExmaples.test.inheritanceConstructor;

import javax.sound.midi.Track;

class Tack {
    static short s = 17;
    public Tack(short ss) {
        new Tack();
        s *= ss;
    }
    public Tack() { ; }
}
public class Bridle extends Tack {
    public Bridle(int s) { System.out.println(s + 1); }
    public static void main(String[] args) {
        Bridle b = new Bridle(3);
        Tack s = new Bridle(3);
        Tack c = new Tack((short) 3);
    }
}