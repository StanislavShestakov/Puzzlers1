package BestExmaples.test;

class Base1{
    static int  sVar = 3;
    int var;
    public Base1() {
    }

    public int getVar() {
        return var;
    }

    public int getStaticVar() {
        return sVar;
    }
    public static int getStaticVarFromStatic() {
        return sVar;
    }

    public void setVar(int var) {
        this.var = var;

    }

}

class Sub1 extends Base1{
    static int sVar = 4;
    int var;
    public Sub1() {
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var+var;
    }

    public int getStaticVar() {
        return sVar;
    }
    public static int getStaticVarFromStatic() {
        return sVar+sVar+sVar;
    }

}
public class HardInharitance {
    public static void main(String[] args) {
        Base1 b = (Base1) new Sub1();
        b.setVar(1);
        System.out.println("variable "+ b.var);
        System.out.println("method " + b.getVar());
        System.out.println("static variable " + b.sVar);
        System.out.println("static variable from normal method " + b.getStaticVar());
        System.out.println("static variable from static method " + b.getStaticVarFromStatic());
      /*  Sub1 s = (Sub1) new Base1(); // runtime classCastException
        s.setVar(1);
        System.out.println(s.getVar());*/


    }
}
