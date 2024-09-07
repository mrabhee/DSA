package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your searched array is :");
        int snum = sc.nextInt();
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == snum) {
                System.out.println("Your number is at index : " + j);
                break;
            }

        }

//        for (int k = 0; k < numbers.length; k++) {
//            System.out.println(numbers[k]);
//        }

//        int[] Age = new int[10];
//        Age[0] = 10;
//        System.out.println(Age[0]);
//        int x = 10;
//        for (int i = 0; i < Age.length; i++) {
//            Age[i] = x;
//            x = x + 10;
//        }
//        for (int j = 0; j < Age.length; j++) {
//            System.out.println(Age[j]);
//        }
    }
}
