package BestExmaples.hardTest;

public class TheLastLaugh {
    public static void main(String[] args) {
        System.out.print("H" + "a");
        System.out.print('H' + 'a');
        System.out.println();
        System.out.println('H' + 'a');
        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);
        System.out.printf("%C%C", 'H', 'a');
    }
}
