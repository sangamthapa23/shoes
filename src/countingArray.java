////public class countingArray {
////    public static void main(String[] args) {
////
////
////        int A[]= {1,2,3,2,4,5,2,5,8,7,4,6,2,2,2,4,5,6};
////
////        int count = 0;
////
////        for(int i=0; i<18; i++){
////            if (A[i]==2){
////                count++;
////            }
////
////
////        }
////
////        System.out.println(count);
////    }
////}
//public class countingArray{
//    public static void main(String[] args) {
//        String A[]={"a","b","a","d","a","b","b","d"};
//       int countA= 0;
//       int countB= 0;
//       int countD= 0;
//
//
//
//        for(int i=0; i<8; i++){
//            if(A[i]=="a"){
//                countA++;
//            }else if(A[i]=="b"){
//                countB++;
//            }else if(A[i]=="d"){
//                countD++;
//            }
//
//
//
//        }
//        System.out.println("Total A "+countA+" Total B "+countB +" Total D

//public class countingArray{
//    public static void main(String[] args) {
//        int A[] = {1, 2, 3, 2, 4, 3, 1, 1};
//        int countA = 0;
//        int countB = 0;
//
//        for (int i = 0; i < 8; i++) {
//            if (A[i] == 1) {
//                countA++;
//            } else if (A[i] == 3) {
//                countB++;
//            }
//        }
//
//            System.out.println("Total count of 1-" + countA + "Total count of 3-" + countB);
//
//
//    }
//}
//public class countingArray{
//    public static void main(String[] args) {
//        String A[]= {"a","b","a","d","a","b"};
//        int countX=0;
//        int countY=0;
//        for(int i=0; i<6; i++){
//            if(A[i]=="a"){
//                countX++;
//            } else if (A[i]=="b") {
//                countY++;
//
//            }
//        }
//        System.out.println("Total count of A is:" +countX);
//        System.out.println("Total count of B is:" +countY);
//
//
//    }
//}
public class countingArray {
    public static void main(String[] args) {
        int A[]={1,2,2,1,4,3,5,2,1};
        int B[]={3,2,4,1,5,3,6,2,1};
        int countX=0;
        int countY=0;
        for (int i=0;i<9;i++){
            if(A[i]==2) {
                countX++;
            }
            } for (int j=0;j<9;j++){
                if(B[j]==2){
                    countY++;
                }

        }

            System.out.println("Total count of 2 is: " +countX);
        System.out.println("Total count of 2 is: " +countY);
        }
    }
