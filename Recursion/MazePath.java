package Recursion;

public class MazePath {
    public static int countPath(int i,int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==n-1 ){
            return 1;
        }
        int downpath = countPath(i+1,j,n,m);
        int rightpath = countPath(i,j+1,n,m);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int count = countPath(0,0,n,m);
        System.out.println(count);

    }
}
