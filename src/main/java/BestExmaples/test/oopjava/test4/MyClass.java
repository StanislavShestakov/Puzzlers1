package BestExmaples.test.oopjava.test4;

class A implements Cloneable{
    public int i=10;
    @Override
    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}

class B extends A implements Cloneable{
    public int i=20;
    @Override
    public B clone() throws CloneNotSupportedException {
        A cloneA = super.clone();
        B cloneB = (B) cloneA;
        System.out.print(cloneB.i+" ");
        return cloneB;
    }
}

public class MyClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        A a = b.clone();
        System.out.println(a.clone().i);
    }
}