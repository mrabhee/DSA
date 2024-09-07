package Arrays;

import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        int A[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("What element you want to search ?");
        int El = sc.nextInt();

        for(int i=0; i<A.length; i++){
            if(A[i] == El){
                System.out.println("Your Element is Found");
                break;
            }
            else {
                System.out.println("Opps! Not Found");
                break;
            }
        }
    }
}
