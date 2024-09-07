package Recursion;

public class Factorial {
    public static int Fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact = Fact(n - 1);
        int factn = n * fact;
        return factn;
    }

    public static void main(String[] args) {
        int num = 5;
        int x = Fact(num);
        System.out.println(x);

    }
}
