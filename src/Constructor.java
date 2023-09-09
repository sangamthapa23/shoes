//public class Constructor {
//    Double length;  //instance variable
//        Double width;
//Double depth;
//
//        Double getArea(){
//
//            //Method
//            Double Area= 2*(length+width);
//        return Area;               //returning area
//
//    }
//    Double getArea(double l,double w,double d){
//
//        //Method
//        Double Area= 2*(length+width+depth);
//        return Area;               //returning area
//
//    }
//    Constructor(Double l, Double w){     //constructor
//        length = l;                    //assigning values to class variables
//        width = w;
//    }
//
//    Constructor(Double l, Double w, Double d){     //constructor
//        length = l;                    //assigning values to class variables
//        width = w;
//        depth = d;
//    }
//    public static void main(String[] args){
//
//        Constructor b = new Constructor(12.3, 12.3);    //object
//        Double  area =  b.getArea();                         //Method calling
//        System.out.println(area);
//
//
//
//        Constructor d = new Constructor(12.3, 12.3, 12.5);    //object
//        Double  areas =  d.getArea(12.3, 12.3, 12.5);                         //Method calling
//        System.out.println(area);
//    }
//
//
//}
//we use constructor for creating only object.
//class name and constructor name are always same.
//object is made by constructor to access the elements of class.
//public class Constructor {
//    double length;
//    double width;
//    double depth;
//
//    double area(){
//        double area= 2*(length + width);
//        return area;
//    }
//    double area(int length,int width,int depth){
//        double area=2*(length+width+depth);
//        return area;
//    }
//    Constructor(double l, double w){
//         length= l;
//         width = w;
//    }
//    Constructor(double l, double w, double d){
//         length= l;
//         width = w;
//         depth = d;
//
//    }
//
//    public static void main(String[] args) {
//        Constructor c= new Constructor(10,20);
//        double area= c.area();
//        System.out.println(area);
//
//        Constructor d= new Constructor(10,20,30);
//        double areas= d.area(10,20,30);
//        System.out.println(areas);
//    }
//}
public class Constructor{
    double length;
    double width;
    double depth;

    double perimeter(){
        double perimeter= 2*(length+width);
        System.out.println(perimeter);
        return perimeter;
    }
    double perimeter(int length,int width,int depth){
        double area=length*width*depth;
        System.out.println(area);
        return area;
    }
    Constructor(double l,double b){
        length=l;
        width=b;
    }
    Constructor(double l, double b, double d){
        length=l;
        width=b;
        depth=d;
    }

    public static void main(String[] args) {
        Constructor x= new Constructor(10,20);
        double perimeter= x.perimeter();
        System.out.println(perimeter);

        Constructor y= new Constructor(10,20,30);
        double perimeter1= y.perimeter(10,20,30);
        System.out.println(perimeter1);
    }
}
