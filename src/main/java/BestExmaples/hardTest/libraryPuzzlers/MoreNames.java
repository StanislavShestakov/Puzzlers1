package BestExmaples.hardTest.libraryPuzzlers;

import java.util.HashMap;
import java.util.Map;

public class MoreNames {
    private Map<String ,String > m = new HashMap<>();

//    public void MoreNames(){
//        m.put("Mickey","Mouse");
//        m.put("Mickey","Mantle");
//    }
public  MoreNames(){
    m.put("Mickey","Mouse");
    m.put("Mickey","Mantle");
}

    public int size(){
        return m.size();
    }

    public static void main(String[] args) {
        MoreNames moreNames = new MoreNames();
        System.out.println(moreNames.size());
    }

}
