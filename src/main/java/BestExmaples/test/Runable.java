package BestExmaples.test;

public class Runable implements Runnable {
    public void run() {
        System.out.println("Hello");
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String... args)  {
        new Thread(new Runable() {
        }).start();
    }
}
