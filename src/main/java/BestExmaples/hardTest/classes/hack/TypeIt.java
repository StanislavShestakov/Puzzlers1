package BestExmaples.hardTest.classes.hack;

import BestExmaples.hardTest.classes.clik.CodeTalk;

public class TypeIt {
    private static class ClickIt extends CodeTalk {
        void printMessage() {
            System.out.println("Hack");
        }
    }


    public static void main(String[] args) {
        ClickIt clickIt = new ClickIt();
        clickIt.doIt();
    }
}
