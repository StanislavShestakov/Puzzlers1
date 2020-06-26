package BestExmaples.hardTest;

public class Increment {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
            k = ++k;
            //what`s realy  heppening? -
           /* int tmp = j;
            j = j + 1;
            j = tmp;*/

        }
        System.out.println(j);
        System.out.println(k);
    }
}
