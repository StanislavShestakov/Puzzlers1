package BestExmaples.hardTest.libraryPuzzlers;

import java.util.*;

public class Name {
    private  final String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    public  int hashCode(){
//        return  37 * first.hashCode() + last.hashCode();
//    }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
        return false;
        Name n = (Name)o;
        return n.first.equals(first) && n.last.equals(last);
    }


    public static void main(String[] args) {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Mickey","Mouse"));
        System.out.println(s.contains(new Name("Mickey","Mouse")));

        System.out.println(new Name("Mickey", "Mouse").equals(new Name("Mickey", "Mouse")));
    }


}
