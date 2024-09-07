package Arrays;

public class NegativeArrayBack {
    public static void main(String[] args) {
        int A[] = {-5,7,5,-3,-4,10,9,-1,-8,11};
        int temp[] = new int[A.length];
        int j = 0;
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]>=0){
                temp[j] = A[i];
                j++;
                count++;

            }

        }
        int k = temp.length-(A.length-count);
        for(int i=0; i<A.length; i++){
            if(A[i]<0){
                temp[k] = A[i];
                k++;
            }
        }
        for(int i=0; i<A.length; i++){
            System.out.println(temp[i]);
        }
    }
}
