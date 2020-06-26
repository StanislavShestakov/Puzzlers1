package BestExmaples.hardTest.exceptionalPuzzlers;

public class ThrownForALoop {
    public static void main(String[] args) {
        int[][] tests = {{6,5,4,3,2,1,},{1,2},{1,2,3},{1,2,3,4},{1}};
        int succcessCount = 0;

//        try{
//            int i = 0;
//            while(true){
//                if(thirdElementIsTree(tests[i++]))
//                    succcessCount++;
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//
//        }
        for (int i = 0; i < tests.length; i++) {
            if(thirdElementIsTree(tests[i]))
                succcessCount++;
        }

        System.out.println(succcessCount);
    }

    private  static  boolean thirdElementIsTree(int[] a){
        return  a.length >=3 && a[2]== 3;
    }
}
