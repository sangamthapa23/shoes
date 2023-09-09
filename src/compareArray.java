////comparing two arrays.
//public class compareArray {
//    public static void main(String[] args) {
//        int D[]={1,2,3,4,5};
//        int E[]= {2,5,6,7,3};
//        for(int i=0;i<5; i++){
//            for(int j=0;j<5; j++){
//                if(D[i]==E[j]){
//                    System.out.println(D[i] +"  - "+ E[j] );
//                }
//            }
//        }
//    }
//}
//// Merge two arrays and make new array.
//public class compareArray{
//    public static void main(String[] args) {
//        int A[]={1,2,3,4};
//        int B[]={2,4,5};
//        int C[]=new int[7];
//        int aKiSize = A.length;    //getting size of array A
//        int bKiSize = B.length;      //getting size of array B
//        int totalLength = aKiSize + bKiSize;
//        for(int i=0; i<aKiSize; i++){
//            C[i] = A[i];
//        }
//
//        for(int i = 0; i<bKiSize; i++){
//
//            C[aKiSize + i] = B[i];
//        }
//        for(int i=0; i<totalLength; i++){
//            System.out.println(C[i]);
//        }
//
//
//    }
//}
//public class compareArray{
//    public static void main(String[] args) {
//        int A[]={1,2,3,4,5};
//        int B[]={6,7,8,9,10};
//        int C[]= new int[10];
//        int sizeA= A.length;
//        int sizeB= B.length;
//        int totalLength=  sizeA + sizeB;
//        for(int i=0; i<sizeA; i++) {
//            C[i] = A[i];
//        }
//
//                for(int i=0; i<sizeB; i++){
//                    C[sizeA + i]=B[i];
//                }
//                for(int i=0; i<totalLength;i++){
//                    System.out.println(C[i]);
//
//
//        }
//    }
//}
//In sequence form.
//public class compareArray{
//    public static void main(String[] args) {
//        int X[]={10,20,30,40};
//        int Y[]={50,60,70};
//        int Z[]={80,90,100};
//        int C[]= new int[10];
//        int sizeX= X.length;
//        int sizeY= Y.length;
//        int sizeZ= Z.length;
//        int totalLength= sizeX + sizeY + sizeZ;
//        for(int i=0;i<sizeX; i++){
//            C[i]= X[i];
//        }for(int i=0; i<sizeY;i++){
//           C[sizeX + i]= Y[i];
//        }for(int i=0; i<sizeZ; i++){
//          C[sizeY + sizeX + i]=Z[i];
//        }
//        for(int i=0; i<totalLength;i++){
//            System.out.println(C[i]);
//        }
//    }
//}
//public class compareArray{
//    public static void main(String[] args) {
//        int A[]={1,2,3,4};
//        int B[]={5,6};
//        int C[]= new int[6];
//        int sizeA= A.length;
//        int sizeB= B.length;
//        int totalLength= sizeA+sizeB;
//        for(int i=0;i<sizeA;i++) {
//            C[i] = A[i];
//        }for(int i=0;i<sizeB;i++) {
//            C[sizeA + i] = B[i];
//        }
//        for(int i=0;i<totalLength;i++){
//            System.out.println(C[i]);
//
//        }
//
//    }
//
//}
//public class compareArray{
//    public static void main(String[] args) {
//        int A[]={ 1,3,2,4};
//        int B[]={2,4,1,5};
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                if(A[i]==B[j]){
//                    System.out.println(A[i]+"-"+B[j]);
//                }
//            }
//        }
//
//    }
//
//}
public class compareArray{
    public static void main(String[] args) {
        int A[]={100,200,300};
        int B[]={400,500};
        int C[]={600,700,800};
        int D[]= new int[8];
        int sizeA= A.length;
        int sizeB= B.length;
        int sizeC= C.length;
        int totalLength= sizeA +sizeB +sizeC;
        for(int i=0;i<sizeA;i++){
            D[i]=A[i];
        }for(int i=0;i<sizeB;i++){
            D[sizeA+i]=B[i];
        }
        for(int i=0;i<sizeC;i++){
            D[sizeA + sizeB +i]=C[i];

        }
        for(int i=0;i<totalLength;i++){
            System.out.println(D[i]);
        }
    }
}