package BestExmaples.hardTest.exceptionalPuzzlers;

public class ExhausingWorkout {
    public static void main(String[] args) {
        workHard();
        System.out.println("It`s nap time.");

    }
    private static  void workHard(){
        try {
                workHard();
            }finally{
                workHard();
            }
        }

}
