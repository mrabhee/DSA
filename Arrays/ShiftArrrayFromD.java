package Arrays;

public class ShiftArrrayFromD {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int temp[] = new int[A.length];
        int j = 0;
        for (int i = d; i < A.length; i++) {
            temp[j] = A[i];
            j++;
        }
        int x = temp.length - d;
        for (int i = 0; i < d; i++) {
            temp[x] = A[i];
            x++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
