package Recursion;

public class FirstAndLaststr {
    public static void Func(String str,int n){
        if(n==str.length()-1){
            System.out.println("Entered in last");
            System.out.println(str.charAt(n));
            return;
        }
        else if (n==0) {
            System.out.println("Entered in first");
            System.out.println(str.charAt(n));

        }
        Func(str,n+1);

    }
    public static void main(String[] args) {
        Func("Abhishek",0);
    }
}
