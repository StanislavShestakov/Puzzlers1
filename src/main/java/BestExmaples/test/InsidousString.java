package BestExmaples.test;

public class InsidousString {
    public static void main(String[] args) {
        String strA = "text";
        String strB = "text";
        strA += "1";
        strB += "1";
        System.out.println(strA != strB);
        strA = "text1";
        strB = "text1";
        System.out.println(strA != strB);
        System.out.println("-------oerator priority------------");
        String s1 = "str";
        String s2 = "str";
        System.out.println("Result: " + s1 == s2);

        int result = 12 + 2 * 5 % 3 - 15 / 4;
        String x = 12 - 6 + "Hello" + 7 + 5;

        System.out.println(result + " - " + x);
        int k = 1;
        System.out.println(k++ + ++k);
    }
}
