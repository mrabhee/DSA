package Arrays;


public class LargestElement {
    public static void main(String[] args) {
        int A[] = {10, 20, 50, 30, 40};
        for (int i = 0; i < A.length; i++) {
            if (i < (A.length - 1)) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
            System.out.print(A[i] + " ");
        }
        System.out.println("\nLargest in Array is: " + A[A.length - 1]);


    }
}
