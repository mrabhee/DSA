package Arrays;

public class ArraReversal {
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50};
//        int j = A.length;
//        int x = A.length;
//        for (int i = 0; i < x; i++) {
//            j--;
//            if (i < (j - 1)) {
//                int temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//            }
//            System.out.println(A[i]);
//        }

        //Using clone array

        int A2[] = new int[A.length];
        int k = A.length;
        for(int i=0; i<A.length; i++){
            A2[i] = A[k-1];
            k--;
        }
        for(int i=0; i<A2.length; i++){
            System.out.println(A2[i]);
        }

    }
}
