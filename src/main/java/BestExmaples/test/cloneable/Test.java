package BestExmaples.test.cloneable;

public class Test {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.setI(4);
        if (a instanceof Cloneable) {
//            A a2 = (A) a.clone();      //hrotected access in to object
//            System.out.println(a.getI() == a2.getI());
        }
    }
}

class A implements Cloneable {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
} 