package BestExmaples.hardTest;

import java.util.regex.Pattern;

public class WhatsMyClass {
    public static void main(String[] args) {
        System.out.println(WhatsMyClass.class.getName().replaceAll(".","/") + ".class");
        System.out.println(WhatsMyClass.class.getName().replaceAll("\\.","/") + ".class");
        System.out.println(WhatsMyClass.class.getName().replaceAll(Pattern.quote("."),"/") + ".class");
    }
}
