package BasicMaths;

public class Hcfandgcd {
    public static void main(String[] args) {
        int gcd = 1;
        int a = 20;
        int b = 15;
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            System.out.println("gcd is : " + b);
        } else {
            System.out.println("gcd is : " + a);
        }
    }
}
