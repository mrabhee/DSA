package Arrays;

public class RotateArrayOneTime {
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40};

        for (int i = 0; i < A.length; i++) {
            if(i<(A.length-1)){
                int temp;
                temp = A[0];
                A[0] = A[i+1];
                A[i+1] = temp;

            }
        }
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
}
