package BestExmaples.hardTest.classes;

class Base{
    public String className = "Base";
}

class Deprived extends Base{
    private String className = "Deprived";
}

public class PrivateMatter {
    public static void main(String[] args) {
       // System.out.println(new Deprived().className);
        System.out.println(((Base)new Deprived()).className);
    }
}
