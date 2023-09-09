//public class Lib {
//    void Student(){
//        String A[]={"Sam","Sangam","Sangi"};
//        for(int i=0;i<3;i++){
//            System.out.println(A[i]);
//        }
//    }
//    void Class(){
//        String B[]={"Class1","Class2","Class3"};
//        for(int i=0;i<3;i++){
//            System.out.println(B[i]);
//        }
//    }
//    void getData(String reqId){
//        if(reqId=="Name"){
//            Student();
//        }else if(reqId=="class"){
//            Class();
//        }else {
//            System.out.println("Not data is there");
//        }
//    }
//
//    public static void main(String[] args) {
//        Lib myLib=new Lib();
//        myLib.getData("Name");
//    }
//}
public class Lib {
    void student() {
        String A[] = {"sangam", "sam", "salman"};
        for (int i = 0; i < 3; i++) {
            System.out.println(A[i]);
        }
    }

    void sports() {
        String B[] = {"cricket", "basketball", "football"};
        for (int i = 0; i < 3; i++) {
            System.out.println(B[i]);
        }
    }

    void getData(int reqId) {
        if (reqId == 1) {
            student();
        } else if (reqId == 2) {
            sports();
        } else {
            System.out.println("Invalid reqId");
        }
    }

}

class record{
    public static void main(String[] args) {
        Lib box1=new Lib();
        box1.getData(1);

    }
}

