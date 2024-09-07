package Recursion;

public class Striingrev {
    public static void Func(String str,int ind){
        if(ind==0){
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        Func(str,ind-1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        Func(str,str.length()-1);
    }
}
