package Recursion;

public class CalcNnum {
    public static void Func(int i,int n ,int sum){
        if(i==n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        Func(i+1,n,sum);
//        System.out.println(i);
    }
    public static void main(String[] args) {
        int num = 10;
        Func(1,5,0);
    }
}
