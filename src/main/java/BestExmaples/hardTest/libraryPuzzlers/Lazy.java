package BestExmaples.hardTest.libraryPuzzlers;



public class Lazy {
    private static  boolean initialized = false;

//    static {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                initialized = true;
//            }
//        });
//        t.start();
//        try{
//            t.join();
//        }catch (InterruptedException e){
//            throw  new AssertionError(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(initialized);
//    }


    private static Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                initialized = true;
            }
            });
    static {
        t.start();
    }



    public static void main(String[] args) {
        try{
            t.join();
        }catch (InterruptedException e){
            throw  new AssertionError(e);
        }
        System.out.println(initialized);
    }
}
