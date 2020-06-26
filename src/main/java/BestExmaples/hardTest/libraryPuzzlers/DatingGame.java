package BestExmaples.hardTest.libraryPuzzlers;

import java.util.Calendar;
import java.util.Date;

public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //cal.set(1999,12,31);
        cal.set(1999,Calendar.DECEMBER,31);
        System.out.println(cal.get(Calendar.YEAR) +" ");


        //Date d = cal.getTime();
       // System.out.println(d.getDay());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }
}
