package BestExmaples.hardTest.libraryPuzzlers;

import BestExmaples.test.Runable;

import java.io.IOException;
import java.io.InputStream;

public class BeerBlast {
    static  final String COMMAND = "java BeerBlast slave";
    public static void main(String[] args) throws Exception{
        if(args.length == 1 && args[0].equals("slave")){
            for(int i =99; i >0 ; i --){
                System.out.println(i + " bottless of beer on the wall");
                System.out.println(i + " bottless of beer");
                System.out.println("You take one down, pass it around,");
                System.out.println((i-1) + " bottless of beer on the wall");
                System.out.println();
            }
        }else{
            //Master
            Process process = Runtime.getRuntime().exec(COMMAND);
            drainInBackground(process.getInputStream());
            int exitValue  = process.waitFor();
            System.out.println("exit value = " + exitValue);
        }
    }

    static void drainInBackground(final InputStream is){
        new Thread(new Runable(){
            public void run(){
                try{
                    while(is.read() >= 0);
                }catch (IOException e){
                    //return on IOException
                }
            }
        }).start();
    }
}
