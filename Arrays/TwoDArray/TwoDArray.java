package Arrays.TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] TwoAge = new int[2][2];
        int num = 10;
        for (int i = 0; i < TwoAge.length; i++) {
            for (int j = 0; j < TwoAge.length; j++) {
                TwoAge[i][j] = num;
                num = num + 10;

            }
        }
        for (int i = 0; i < TwoAge.length; i++) {
            for (int j = 0; j < TwoAge.length; j++) {
                System.out.print(TwoAge[i][j] + " ");

            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("I want to search this number :");
        int number =  sc.nextInt();
        for (int i = 0; i < TwoAge.length; i++) {
            for (int j = 0; j < TwoAge.length; j++) {
                if(TwoAge[i][j] == number){
                    System.out.print("Your given number is at this index : "+i+""+j);
                }

            }

        }
    }
}
