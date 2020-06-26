package BestExmaples.hardTest.libraryPuzzlers;
import  java.math.BigInteger;

public class BigProblem {
    public static void main(String[] args) {
        BigInteger fiveThousnd = new BigInteger("5000");
        BigInteger fiftyThousnd = new BigInteger("50000");
        BigInteger fiveHundredThousnd = new BigInteger("500000");

        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousnd);
        total.add(fiftyThousnd);
        total.add(fiveHundredThousnd);
        System.out.println(total);

        total = total.add(fiveThousnd);
        total = total.add(fiftyThousnd);
        total = total.add(fiveHundredThousnd);
        System.out.println(total);

    }
}
