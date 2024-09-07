package Recursion;

import Arrays.Array;

public class ArraSortedorNot {
    public static Boolean Func(int A[], int i){
        if(i==A.length-1){
            return true;
        }
        if(A[i]<A[i+1]){
            return Func(A , i+1);

        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};

        System.out.println( Func(A,0));
    }
}
