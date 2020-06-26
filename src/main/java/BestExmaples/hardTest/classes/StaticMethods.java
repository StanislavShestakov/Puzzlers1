package BestExmaples.hardTest.classes;

public class StaticMethods {
    public static void main(String[] args) {
        Dog woofer = new Dog();
        Dog nipper = new Dog();
        woofer.bark();
        nipper.bark();
    }
}

class Dog{
    public  static void bark(){
        System.out.print("Woof ");
    }
}

class Basenji extends  Dog{
    public  static void bark(){}
}
