package Recursion;

public class Number {
    public static void Func(int num) {
        System.out.println(num);
        if (num == 5) {
            return;
        }
        Func(num + 1);
    }

    public static void main(String[] args) {
        Func(1);
    }
}
