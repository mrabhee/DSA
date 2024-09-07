package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 2552;
        int rev = 0;
        int dup = n;
        while (n > 0) {
            int id = n%10;
            rev = (rev*10)+id;
            n=n/10;

        }
        System.out.println(dup);
        if(rev == dup){
            System.out.println("Number is palindrome");
        }
    }
}
