package BestExmaples.hardTest.libraryPuzzlers;


import java.util.Timer;
import java.util.TimerTask;

public class Worker extends Thread {
    private volatile boolean quittingTime = false;
    public  void run(){
        while (!quittingTime)
            pretendToWork();
        System.out.println("Beer is good");
    }

    private void pretendToWork() {
        try {
            Thread.sleep(300); //Sleeping on the job;
        } catch (InterruptedException ex) {
        }
    }

    private final Object lock = new Object();
    //It`s quitting time, wait for worker - Called by good boss
    void quit() throws InterruptedException{
        synchronized (lock){
            quittingTime = true;
            join();
        }
    }



//        //It`s quitting time, waitfor worker - Called by good boss
//        synchronized void quit() throws InterruptedException {
//            quittingTime = true;
//            join();
//        }
        //Rescing quitting time - Called by evil boss

  //Rescind quitting time - Called by evil boss
    void keepWorking(){
        synchronized (lock){
            quittingTime = false;
        }
    }

//        synchronized void keepWorking() {
//            quittingTime = false;
//        }

    public static void main(String[] args)throws InterruptedException{

            final Worker worker = new Worker();
            worker.start();

            Timer t = new Timer(true); //Deamon thread
            t.schedule(new TimerTask(){
                public void run(){ worker.keepWorking();}
            }, 500);

            Thread.sleep(400);
            worker.quit();
        }
    }


