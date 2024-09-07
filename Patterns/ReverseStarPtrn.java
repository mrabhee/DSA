package Patterns;

public class ReverseStarPtrn {
    public static void main(String[] args) {
        int n = 3;
        for(int i=n; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
