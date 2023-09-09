//public class sortingArray {
//    public static void main(String[] args) {
//        int A[] = {1, 5, 4, 3, 2, 8, 7, 6, 9, 10};
//        for (int i = 0; i < 10; i++) {
//
//           for (int j = i + 1; j < 10; j++) {
//
//
//               if(A[i]> A[j]){
//
//                   int temp = 0;
//                   temp = A[i];
//                   A[i] = A[j];
//                   A[j] = temp;
//
//               }
//
//          }
//        }
//
//
//        for(int i = 0; i< 10; i++){
//
//            System.out.print(A[i]);
//        }
//
//        }
//    }
//

//public class sortingArray{
//    public static void main(String[] args) {
//        int A[]= {4,2,1,5,3,6};
//        for(int i=0; i<6; i++){
//            for(int j=i+1; j<6; j++){
//                if(A[i]>A[j]){
//                    int k=0;
//                    k = A[i];
//                    A[i]=A[j];
//                    A[j]=k;
//
//                }
//            }
//
//
//        }
//        for(int i=0; i<6;i++){
//            System.out.println(A[i]);
//        }
//    }
//}
//public class sortingArray{
//    public static void main(String[] args) {
//        int A[]={3,2,6,5,7,1,4};
//        for(int i=0; i<7; i++){
//            for(int j=i+1; j<7; j++){
//                if (A[i] > A[j]){
//                    int k=0;
//                    k= A[i];
//                    A[i]=A[j];
//                    A[j]=k;
//                }
//            }
//        }
//
//
//            System.out.println(A.length);
//
//    }
//}
//public class sortingArray {
//    public static void main(String[] args) {
//        int A[] = {2, 1, 4, 3, 5};
//        for (int i = 0; i < 5; i++) {
//            for (int j = i + 1; j < 5; j++) {
//                if (A[i] > A[j]) {
//                    int temp = 0;
//                    temp = A[i];
//                    A[i] = A[j];
//                    A[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(A[i]);
//        }
//    }
//}

public class sortingArray {
    public static void main(String[] args) {
        int A[]={2,5,3,4,1,6,9,8,7};
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(A[i]<A[j]){
                    int k=0;
                    k=A[i];
                    A[i]=A[j];
                    A[j]=k;
                }
            }
        }
        for(int i=0;i<9;i++){
            System.out.println(A[i
                    ]);
        }
    }


}