package BestExmaples.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListIterrator {
    public static void main(String[] args) {
        String[] str = new String[] { "1", "2", "3" };

        List list = Arrays.asList(str);
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Object object = (Object) iterator.next();
            iterator.remove();//UnsupportedOperationException
        }
        System.out.println(list.size());
    }
}
