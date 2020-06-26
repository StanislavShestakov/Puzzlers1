package BestExmaples.hardTest.libraryPuzzlers;

public class PingPong {
    public static synchronized void main(String[] args) {
        Thread t = new Thread(){
          public  void run(){pong();}
        };
        t.run();
        System.out.println("Ping");
    }


    static synchronized  void pong(){
        System.out.println("Pong");
    }
}
