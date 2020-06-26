package BestExmaples.hardTest.exceptionalPuzzlers;

public class Indecision {
    public static void main(String[] args) {
        System.out.println(decision());
    }
    static  boolean decision(){
        try{
            return true;
        }finally {
            return  false;
        }
    }
}
