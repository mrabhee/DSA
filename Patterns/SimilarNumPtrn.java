package Patterns;

public class SimilarNumPtrn {
    public static void main(String[] args) {
        int n=3;
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
