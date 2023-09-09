//import java.awt.*;
//
//public class forEachLoop {
//
//
//    public static void main(String[] args) {
//        int X[] = {1,2,3,4,5,6,7,8,9,10};
//
//        int Sum = 0;
//
//        for(int nidhiPro: X ){
//            System.out.println("Value is : "+nidhiPro);
//            Sum +=nidhiPro;
//        }
//
//        System.out.println("Value is : "+Sum);
//    }
//}
//public class forEachLoop {
//    public static void main(String[] args) {
//
//
//        int A[] = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int X : A) {
//            System.out.println(X);
//            sum+=X;
//        }
//        System.out.println(sum);
//    }
//}
public class forEachLoop {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7};
        int sum=0;
        for(int X:A){
            System.out.println(X);
            sum+=X;
        }
        System.out.println(sum);
    }
}
