package BestExmaples.hardTest.libraryPuzzlers;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReflectionInfection {
    public static void main(String[] args) throws Exception {
        Set<String> s = new HashSet<>();
        s.add("foo");
        Iterator it = s.iterator();
       // it.hasNext();
        Method m1 = Iterator.class.getMethod("hasNext");
        System.out.println(m1.invoke(it));
        Method m = it.getClass().getMethod("hasNext");
        System.out.println(m.invoke(it));

    }
}
