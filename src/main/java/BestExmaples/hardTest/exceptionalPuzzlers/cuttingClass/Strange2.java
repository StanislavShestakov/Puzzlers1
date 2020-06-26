package BestExmaples.hardTest.exceptionalPuzzlers.cuttingClass;

public class Strange2 {
    public static void main(String[] args) {
        Missing m;
        try{
            m  = new Missing();
        }catch (java.lang.NoClassDefFoundError ex){
            System.out.println("Got it!");
        }
    }

}
