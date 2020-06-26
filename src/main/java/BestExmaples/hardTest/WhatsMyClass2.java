package BestExmaples.hardTest;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhatsMyClass2 {
    public static void main(String[] args) {
        //System.out.println(WhatsMyClass2.class.getName().replaceAll("\\.", File.separator) + ".class");
        System.out.println(WhatsMyClass2.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
        System.out.println(WhatsMyClass2.class.getName().replace('.', File.separatorChar) + ".class");

    }
}
