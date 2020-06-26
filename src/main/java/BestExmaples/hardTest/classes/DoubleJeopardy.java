package BestExmaples.hardTest.classes;

class Jeopardy {
    public static final String PRIZE = "$64,000";

    public static final String prize(){
        return PRIZE;
    }
}

public class DoubleJeopardy extends Jeopardy {
    public static final String PRIZE = "2 000 000 cents";

    public static void main(String[] args) {
        System.out.println(DoubleJeopardy.PRIZE);
        System.out.println(DoubleJeopardy.prize());
    }
}




