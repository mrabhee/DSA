package Patterns;

public class Binarypattern {
    public static void main(String[] args) {
        int n=5;
        int a = 1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                int x = i+j;
                if(x%2==0){
                    System.out.print(a+" ");
                }
                else{
                    System.out.print(a-1+" ");
                }
            }
            System.out.println();

        }
    }
}
