package BestExmaples.inharitanceProblem;


class A {
    protected int x1 = 2;
    private int x2 = 3;
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}

class B extends A {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}

public class Inheritance  {
    public static void main(String[] args) {
        A classA = new B();
        classA.printX();
        System.out.println(classA.x);
        System.out.println(classA.x1);
        //System.out.println(classA.x2);

    }
}