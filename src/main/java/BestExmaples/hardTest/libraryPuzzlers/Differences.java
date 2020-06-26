package BestExmaples.hardTest.libraryPuzzlers;

import java.util.HashSet;
import java.util.Set;

public class Differences {
    public static void main(String[] args) {
        int[] vals= {789,678,567,456,345,234,123,012};
        Set<Integer> diffs = new HashSet<Integer>();
        for (int i = 0; i < vals.length; i++)
            for (int j = 0; j < vals.length; j++)
                diffs.add(vals[i] - vals[j]);
        System.out.println(diffs.size());

        System.out.println(diffs);
        for(int i : diffs){
            System.out.print(i+" ");
        }
    }
}
