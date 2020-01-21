package expressivePuzzlers;

import java.math.BigDecimal;

public class MonetiaryProblem {
    public static void main(String[] args) {
        System.out.println(2.00-1.10); //0.8999999999...
        System.out.printf("%.2f%n", 2.00-1.10);
        System.out.println((200-110) + " cents");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));


    }
}
