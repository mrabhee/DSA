package Recursion;

public class Firstfunction {
    static int cnt = 0;
    static void print(){

        if(cnt == 10) return;
        System.out.println("Abhishek");

        cnt = cnt+1;
        print();

    }
    public static void main(String[] args) {
        print();
    }
}
