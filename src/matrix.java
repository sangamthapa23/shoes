//public class matrix {
//    public static void main(String[] args) {
//        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
//        };
//        int B[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        // int C[][] = { {2,4,6}, {8,10,12}, {14,16,18} };
//
//        int C[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//
//            for(int j = 0; j<3; j++){
//
//                C[i][j] = A[i][j]+B[i][j];
//
//                System.out.println(C[i][j]);
//
//            }
//        }
//
//
//
//    }
//}
//
public class matrix {
    public static void main(String[] args) {
        int A[][]={{2,3,4},{5,6,7}};
        int B[][]={{3,3,4},{8,6,7}};
        int C[][]=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                 C[i][j]= A[i][j]+B[i][j];
                System.out.println(C[i][j]);
            }
        }

    }
}