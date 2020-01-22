package BestExmaples.inharitanceProblem;

public class OrderInitBlock {
    int i = getInt();
    int k = 20;
    public int getInt() {  return k+1;  }
    public static void main(String[] args) {
        OrderInitBlock t = new OrderInitBlock();
        System.out.println(t.i + "  " + t.k);
    }
}
