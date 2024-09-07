package Recursion;

public class TowerOfHonoi {
    public static void func(int n,String S,String H,String D){

        if (n == 1) {
            System.out.println(n+" disk transfered from "+S+" to "+D);
            return;
        }
        func(n-1,S,D,H);
        System.out.println(n+" disk transfered from "+S+" to "+D);
        func(n-1,H,S,D);

    }
    public static void main(String[] args) {
        int num = 3;
        func(num,"S","H","D");
    }
}
