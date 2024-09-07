package Recursion;

public class StackHeight {
    public static int xpow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpower = xpow(x,n-1);
        int xpowers = x*xpower;
        return xpowers;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = xpow(x,n);
        System.out.println(ans);
    }
}
