package BasicMaths;

public class Reversenum {
    public static void main(String[] args) {
        int A = 12345;
        int temp = 0;
        while (A > 0) {
            int id = A%10;
            temp = (temp*10)+id;
            A=A/10;

        }
        System.out.println(temp);
    }
}
