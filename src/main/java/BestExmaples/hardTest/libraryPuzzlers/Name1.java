package BestExmaples.hardTest.libraryPuzzlers;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Name1 {
    private final String first, last;

    public Name1(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public  int hashCode(){
        return  37 * first.hashCode() + last.hashCode();
    }
//    public boolean equals(Name1 n) {
//        return n.first.equals(first) && n.last.equals(last);
//    }

    public boolean equals(Object o) {
        if (!(o instanceof Name1))
            return false;
        Name1 n = (Name1)o;
        return n.first.equals(first) && n.last.equals(last);
    }
//    @Override
//    public boolean equals(Object o) {
//        return o instanceof Name1 && equals((Name1) o);
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Name1 name1 = (Name1) o;
//        return Objects.equals(first, name1.first) &&
//                Objects.equals(last, name1.last);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(first, last);
//    }

    public static void main(String[] args) {
        Set<Name1> s = new HashSet<Name1>();
        s.add(new Name1("Mickey","Mouse"));
        System.out.println(s.contains(new Name1("Mickey","Mouse")));

       // System.out.println(new Name1("Mickey", "Mouse").equals(new Name1("Mickey", "Mouse")));


    }

}
