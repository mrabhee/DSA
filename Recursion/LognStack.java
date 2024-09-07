package Recursion;

public class LognStack {
    public static int calcPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPow(x,n/2) * calcPow(x,n/2);
        }
        else{
            return calcPow(x,n/2) * calcPow(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int num = 5;
        int ans = calcPow(x,num);
        System.out.println(ans);
    }
}
