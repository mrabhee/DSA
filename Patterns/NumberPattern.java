package Patterns;

public class NumberPattern {
    public static void main(String[] args) {
        int n =5;
        int a=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++ ){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();

        }
    }
}
