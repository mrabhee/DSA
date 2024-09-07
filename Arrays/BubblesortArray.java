package Arrays;

public class BubblesortArray {
    public static void main(String[] args) {
        int A[] = {10,20,60,70,80,90,30,40,50};

        for (int i = 0; i < A.length; i++) {
            for(int j=i+1; j<A.length; j++){
                if (i < A.length-1) {
                    if (A[i] > A[j]) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;

                    }
                }
            }
            System.out.print(A[i] + " ");
        }
    }
}





