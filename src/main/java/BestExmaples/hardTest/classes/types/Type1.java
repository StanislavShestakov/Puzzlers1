package BestExmaples.hardTest.classes.types;

public class Type1 {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s instanceof String);
    }
}

class  Type2{
    public static void main(String[] args) {
        //System.out.println(new Type2() instanceof String); // compile exc
    }
}


class  Type3{
    public static void main(String[] args) {
        Type3 t3 = (Type3) new Object(); //runtime exc
        //System.out.println(new Type2() instanceof String);
    }
}
