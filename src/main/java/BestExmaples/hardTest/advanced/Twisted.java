package BestExmaples.hardTest.advanced;

public class Twisted {
    private final String name;

    public Twisted(String name) {
        this.name = name;
    }
    private String name(){
        return name;
    }

    private void reproduce(){
        new Twisted("reproduse"){
         void printName(){
             System.out.println(name());
         }
        }.printName();
    }

    public static void main(String[] args) {
        new Twisted("main").reproduce();
    }
}
