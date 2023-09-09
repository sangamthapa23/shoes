//public class maxNumberArray {
//    public static void main(String[] args) {
//        int A[] = {1, 5, 7, 9, 4, 11};
//        for (int i = 0; i < 6; i++) {
//            for (int j = i + 1; j < 6; j++) {
//                if (A[i] > A[j]) {
//                    int temp = 0;
//                    temp = A[i];
//                    A[i] = A[j];
//                    A[j] = temp;
//                }
//            }
//
//        }
//
//        //for (int i=0; i < 6; i++) {
//            System.out.println(A[5]);
//       // }
//    }
//}

//public class maxNumberArray {
//    public static void main(String[] args) {
//        int A[] = {1, 5, 7, 9, 4, 11};
//        for (int i = 0; i < 6; i++) {
//            for (int j = i + 1; j < 6; j++) {
//                if (A[i] > A[j]) {
//                    int temp = 0;
//                    temp = A[i];
//                    A[i] = A[j];
//                    A[j] = temp;
//                }
//            }
//
//        }
//
//        //for (int i=0; i < 6; i++) {
//        System.out.println(A[0]);
//        // }
//    }
//}
//public class maxNumberArray {
//    public static void main(String[] args) {
//        int A[] = {2, 4, 3, 1, 5, 8};
//        for (int i = 0; i < 6; i++) {
//            for (int j = i + 1; j < 6; j++) {
//                if (A[i] > A[j]) {
//                    int K = 0;
//                    K = A[i];
//                    A[i] = A[j];
//                    A[j] = K;
//                }
//            }
//        }
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println(A[5]);
//        }
//
//
//    }
//}

public class maxNumberArray{
    public static void main(String[] args) {
        int A[]={1,3,2,4,6,5};
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(A[i]<A[j]){
                    int temp=0;
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
//        for(int i=0;i<6;i++)
        {
            System.out.println(A[4]);
        }
    }
}