package Recursion;

public class PlaceTile {
    public static int Placed(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = Placed(n-m,m);
        int horizontal = Placed(n-1,m);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n= 4;
        int m = 2;
        int count = Placed(n,m);
        System.out.println(count);
    }
}
