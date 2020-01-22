package BestExmaples.hardTest;

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
    }
}
