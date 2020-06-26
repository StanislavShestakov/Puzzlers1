package BestExmaples.hardTest.classes;

//class Point{
//        private final int x,y;
//        private  final String name;
//        Point(int x, int y){
//            this.x= x;
//            this.y= y;
//            name = makeName();
//        }
//
//        protected  String makeName(){
//            return "[" + x + "," + y + "]";
//        }
//
//        public  final String toString(){
//            return  name;
//        }
//}

class Point{
    protected  final int x,y;
    private  String name;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected  String makeName(){
            return "[" + x + "," + y + "]";
        }

        public  final synchronized  String toString(){ //lazy  initialization
        if(name == null)
            name = makeName();
        return  name;
        }
}


public class ColorPoint  extends  Point{
    private  final String color;

    ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }


    protected String makeName(){
        return  super.makeName() + ":" + color;
    }

    public static void main(String[] args) {
        System.out.println(new ColorPoint(4,2, "purple"));
    }
}
