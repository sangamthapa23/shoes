import java.util.Locale;

//public class methodOverloading {
//    double length;
//    double width;
//
//    void area(){
//        double area= length*width;
//        System.out.println(area);
//    }
//    void area(int addAmount){
//        double area=length*width +addAmount;
//        System.out.println(area);
//    }
//
//    public static void main(String[] args) {
//        methodOverloading box=new methodOverloading();
//        box.length=10;
//        box.width=20;
//        box.area(50);
//
//    }
//}
//public class methodOverloading {
//    double length;
//    double width;
//
//
//    public double area(){
//        double area=length*width;
//
//        return area;
//    }
//    public double area(int getAmount){
//        double area= length+width;
//        return  area;
//
//    }
//
//    public static void main(String[] args) {
//        methodOverloading box=new methodOverloading();
//        box.length=10;
//        box.width=10;
//        double area1 = box.area();
//       double area = box.area(50);
//        System.out.println(area);
//        System.out.println(area1);
//
//    }
//}{
//public class methodOverloading {
//    public String[] name() {
//        String A[] = {"sam", "sangu", "sangam"};


//        return A;
//
//    }
//
//    public static void main(String[] args) {
//        methodOverloading box = new methodOverloading();
//
//        String[] A = box.name();
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(A[i]);
//        }
//    }
//}
//
//public class methodOverloading {
//    void test(){
//        System.out.println("No parameter");
//    }
//    void test(int a){
//        System.out.println("A:" +a);
//    }
//    void test(int a,int b){
//        System.out.println("A:" +a + "B:" +b);
//    }
//
//    public static void main(String[] args) {
//        methodOverloading box= new methodOverloading();
//        box.test();
//        box.test(10);
//        box.test(10,20);
//    }
//
//}
//public class ConstructorOverloading {
//    public String inputs() {
//        String Name= "Sangam";
//        System.out.println("Name");
//        return  Name;
//    }
//
//    void inputs(int a) {
//        System.out.println("A: " + a);
//    }
//
//    void inputs(int a, int b) {
//        System.out.println("A: " + a + "B:" + b);
//
//    }
//
//    ConstructorOverloading(){
//
//    }
//
//}
//    class valuess{
//        public static void main(String[] args) {
//            ConstructorOverloading value= new ConstructorOverloading();
//
//            value.inputs();
//            String name= value.inputs();
//          name =  name.toLowerCase(Locale.ROOT);
//            System.out.println(name);
//            value.inputs(85);
//            value.inputs(48, 85);
//
//
//        }
//    }
//method: collection of statement to perform a specifc task. It has return type. If it is not returning any value then return type is void.

//public class ConstructorOverloading {
//    String Name, collegeName;
//    int id, standard;
//    ConstructorOverloading(String Name, String collegeName){
//        this.Name= Name;
//        this.collegeName=collegeName;
//    }
//    ConstructorOverloading(int id,int standard){
//        this.id=id;
//        this.standard=standard;
//    }
//
//    public static void main(String[] args) {
//        ConstructorOverloading x=new ConstructorOverloading("Sangam",  "dit university");
//        System.out.println("Name-" +x.Name    +    "collegeName-"   +x.collegeName);
//
//        ConstructorOverloading X= new ConstructorOverloading(12 , 6);
//        System.out.println("id-" +x.id  +  "standard-" + x.standard); ;
//    }
//}


