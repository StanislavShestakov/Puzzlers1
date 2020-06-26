package BestExmaples.hardTest.libraryPuzzlers;

public class SelfInterruption {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();

//        if(Thread.interrupted()){
//            System.out.println("Interrupted: " + Thread.interrupted());
//        }else{
//            System.out.println("Not interrupted: " + Thread.interrupted());
//        }

        if(Thread.currentThread().isInterrupted()){
            System.out.println("Interrupted: " + Thread.currentThread().isInterrupted());
        }else{
            System.out.println("Not interrupted: " + Thread.currentThread().isInterrupted());
        }
    }
}
