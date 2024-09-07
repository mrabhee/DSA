package BasicMaths;

public class Countdigit {
    public static void main(String[] args) {
        int A = 12345;
        int count = 0;
        while(A>0){
            A =A/10;
            count++;

        }
        System.out.println(count);
    }
}
