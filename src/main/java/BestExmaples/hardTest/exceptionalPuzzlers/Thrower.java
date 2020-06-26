package BestExmaples.hardTest.exceptionalPuzzlers;

public class Thrower {
    public static Throwable t;

    private Thrower() throws  Throwable{
        throw t;
    }

    public  static  synchronized  void sneakyThrow(Throwable t)  {
        Thrower.t = t;
        try{
            Thrower.class.newInstance();
        }catch (InstantiationException e){
            throw  new IllegalArgumentException();
        }catch (IllegalAccessException e){
            throw  new IllegalArgumentException();
        }finally {
            Thrower.t = null; // avoid memory leak
        }
    }
}
