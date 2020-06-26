package BestExmaples.test;

import java.util.ArrayList;
import java.util.List;

public class ListAddNull {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(2);
        list.add(null);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
