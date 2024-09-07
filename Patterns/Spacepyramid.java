package Patterns;

public class Spacepyramid{
    public static void main(String[] args) {
        int n=3;
        for(int i=0; i<=n; i++){
            //Space
            for(int j=0; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=0; i--){
            for(int j=0; j<=n-i; j++ ){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}