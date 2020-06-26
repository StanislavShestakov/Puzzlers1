package BestExmaples.test;


class MyThread extends Thread {
    public void run() {
        System.out.print("Running ");
    }

    public void start() {
        System.out.print("Starting ");
    }
}

public class ThreadStart {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
