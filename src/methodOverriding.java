//public class methodOverriding {
//   public int i,j;
//
//    void student(int a, int b){
//         i=a;
//         j=b;
//    }
//    public void show(int i){
//        System.out.println("Base Class show method");
//    }
//}
//class room extends methodOverriding {
//    int total;
//
//    public int value() {
//        total = i + j;
//        return total;
//    }
//
//    void show() {
//        System.out.println("Child Class show method");
//
//
//    }
//}
//class xyz{
//    public static void main(String[] args) {
//        methodOverriding c=new methodOverriding();
//        c.show(1);
//
//
//
//    }
//
//}
//public class methodOverriding {
//    int i, j;
//
//    void X(int a, int b) {
//         i = a;
//         j = b;
//    }
//
//    public void show(int i) {
//        System.out.println("base class method");
//    }
//
//    class Y extends methodOverriding {
//
//        int total;
//
//        public int value() {
//            int total = i + j;
//            return total;
//        }
//        void show(){
//            System.out.println("child class values");
//        }
//    }
//}
//class Sam{
//    public static void main(String[] args) {
//        methodOverriding x=new methodOverriding();
//        x.X(10, 20);
//    }
//
//}
public class methodOverriding {
    int i,j;

    void value(int a, int b ){
         i=a;
         j=b;
    }
    public void show(int i){
        System.out.println("value to first class");
    }
}
class sam extends methodOverriding{
    int total;

    public int  value1(){
        total= i+ j;
        return total;
    }
    public void show(){
        System.out.println("value to second class");
    }
}
class india{
    public static void main(String[] args) {
        sam x=new sam();
        x.show(10);

    }
}


