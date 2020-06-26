package BestExmaples.test;

abstract class NonMandatoryAbstractMethod {

        private static int getHalf(int i){
            return i/2;
        }
        public static void main(String[] str){
            int half=getHalf(0);
            System.out.println("Result is:"+half);
        }

}
