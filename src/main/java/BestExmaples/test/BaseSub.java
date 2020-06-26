package BestExmaples.test;

class Base {
    public String name = "Base";
    public String getName() {
        return name;
    }
}

class Sub extends Base {
    public String name = "Sub";
    public String getName() {
        return name;
    }
}

public class BaseSub {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;
        System.out.println(b.name);
    }
}