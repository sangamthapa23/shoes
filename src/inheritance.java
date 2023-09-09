//public class inheritance {
//    int i, j;
//
//    void assignValues(int a, int b) {
//    int i = a;
//    int j = b;
//
//    }
//}
//    class B extends inheritance{
//        int total;
//
//
//        public int getTotal(){
//            total = i+j;
//            return total;
//        }
//
//
//    }
//
//
//    class Access {
//
//        public static void main(String[] args) {
//            B b = new B();
//            b.assignValues(10,20);
//            b.getTotal();
//        }
//    }
//
//public class inheritance {
//    int i, j;
//
//    void assign(int a, int b) {
//        System.out.println(a+" "+b);
//         i = a;
//         j = b;
//    }
//}
//    class B extends inheritance {
//        int total;
//
//        public int totalValue() {
//           // System.out.println(a+" "+b);
//            total = i + j;
//            System.out.println(total);
//            return total;
//        }
//    }
//
//    class X{
//        public static void main(String[] args) {
//            B b = new B();
//            b.assign(10,20);
//           // b.totalValue();
//             int total= b.totalValue();
//             System.out.println(total);
//
//        }}
//public class inheritance {
//    int i, j;
//
//    void assign(int a, int b) {
//        int i = a;
//        int j = b;
//
//    }
//}
//
//    class C extends inheritance {
//        int total;
//
//        public int assignValues() {
//            total = i + j;
//            System.out.println(total);
//            return total;
//        }
//    }
//    class X{
//        public static void main(String[] args) {
//            C c=new C();
//            c.assign(10,20);
//            c.assignValues();
//            int total= c.assignValues();
//            System.out.println(total);
//
//
//        }
//    }

//public class inheritance {
//    int i,j;
//
//    void assign(int a, int b){
//        int i=a;
//        int j=b;
//    }
//}
//class B extends inheritance{
//    int total;
//
//    public int assignValues(){
//        total = i+j;
//        System.out.println(total);
//        return total;
//    }
//}
//class  X{
//    public static void main(String[] args) {
//        B c=new B();
//        c.assign(10,20);
//        c.assignValues();
//        int total= c.assignValues();
//        System.out.println(total);
//    }
//}
public class inheritance {
    int i,j;

    void put(int a, int b){
        int i=a;
        int j=b;
    }

}
class A extends inheritance{
    int total;
     public int putValues(){
         total=i+j;
         System.out.println(total);
         return total;
     }
}
class X{
    public static void main(String[] args) {
        A c=new A();

        c.put(10,10);
        c.putValues();
        int total= c.putValues();
        System.out.println(total);
    }
}






