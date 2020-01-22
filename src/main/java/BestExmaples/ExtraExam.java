package BestExmaples;

import java.util.ArrayList;
import java.util.List;

public class ExtraExam {
    public static void main(String[] args) {
        List buf = new ArrayList(2);

        System.out.print(buf.size());

        buf.add(10);

        System.out.print(buf.size());

        buf.add(20);
        buf.add(30);

        System.out.println(buf.size());
    //---------------------------------------------------------

        List buf1 = new ArrayList(3);

        buf1.add(new Integer(3));
        buf1.add(new Integer(3));
        buf1.add(new Integer(3));
        buf1.add(new Integer(3));

        System.out.println(buf1.size());
        //---------------------------------------------------------

        int a = 0;
        System.out.println("a=" + new Integer(a = 1));

        //---------------------------------------------------------

        int i = 0;
        int j = 1;
        System.out.println(i += (j < i) ? (2) : (3));

        //---------------------------------------------------------

        int y = 0;
        int p =y++;
        System.out.println(p);
    }
}
