package Recursion;

public class Fibonacci {
    public static void Fibo(int x,int y,int n){
        if(n==0){
            return;
        }
        int z = x+y;
        System.out.println(z);
        Fibo(y,z,n-1);



    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num = 5;
        System.out.println(a);
        System.out.println(b);
        Fibo(a,b,num-2);

    }
}
